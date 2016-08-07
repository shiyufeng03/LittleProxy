package org.littleshoot.proxy;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class SDWBaseChainedProxy extends ChainedProxyAdapter {
    @Override
    public InetSocketAddress getChainedProxyAddress() {
        try {
            return new InetSocketAddress(InetAddress
//                    .getByName("192.168.31.189"),
//                    8080);
            		
            		.getByName("59.39.88.190"),
                    8080);
        } catch (UnknownHostException uhe) {
            throw new RuntimeException(
                    "Unable to resolve  192.168.31.189?!");
        }
    }
}
