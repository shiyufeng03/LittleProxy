package org.littleshoot.proxy;

import io.netty.handler.codec.http.HttpObject;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;

public class SDWHttpFiltersAdapter extends HttpFiltersAdapter{

	public SDWHttpFiltersAdapter(HttpRequest originalRequest) {
		super(originalRequest);
	}
	
	@Override
    public HttpResponse clientToProxyRequest(HttpObject httpObject) {
		String uri = this.originalRequest.getUri();  
        
        System.out.println("uri:"+uri);  
        return null;
    }

    @Override
    public HttpObject serverToProxyResponse(HttpObject httpObject) {
        // TODO: implement your filtering here
        return httpObject;
    }

}
