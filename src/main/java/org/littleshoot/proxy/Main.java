package org.littleshoot.proxy;

import java.net.InetSocketAddress;

import org.littleshoot.proxy.impl.DefaultHttpProxyServer;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpRequest;

public class Main {

	public static void main(String args[]) {
        HttpProxyServerBootstrap strap = DefaultHttpProxyServer.bootstrap();
        strap.withAddress(new InetSocketAddress("192.168.31.189", 8089))
        	.withFiltersSource(new HttpFiltersSourceAdapter() {
                public HttpFilters filterRequest(HttpRequest originalRequest, ChannelHandlerContext ctx) {
                    return new SDWHttpFiltersAdapter(originalRequest);
                }
            })
        	.withChainProxyManager(new SDWChainedProxyManager())
        	;
        
        strap.start();
    }
}
