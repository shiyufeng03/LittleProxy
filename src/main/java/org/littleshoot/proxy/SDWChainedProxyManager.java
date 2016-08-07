package org.littleshoot.proxy;

import java.util.Queue;

import io.netty.handler.codec.http.HttpRequest;

public class SDWChainedProxyManager implements ChainedProxyManager{

	@Override
	public void lookupChainedProxies(HttpRequest httpRequest, Queue<ChainedProxy> chainedProxies) {
		chainedProxies.add(new SDWBaseChainedProxy());
	}

}
