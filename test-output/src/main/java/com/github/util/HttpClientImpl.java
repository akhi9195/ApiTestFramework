package com.github.util;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;  
public class HttpClientImpl implements HttpUtil{
	private static final Logger logger =  LogManager.getLogger(HttpClientImpl.class);
	public HttpClientImpl() {
		  BasicConfigurator.configure();  
	}
	
	@Override
	public CloseableHttpResponse get(String uri) {
		
		logger.info("URI:"+uri);
		boolean isRequestSuccess =false;
		CloseableHttpResponse  closeableHttpResponse = null;
		try {
			CloseableHttpClient client = HttpClients.createDefault();
			HttpGet getRequest = new HttpGet(uri);

			for (int i = 0; i < 3; i++) {
				closeableHttpResponse = client.execute(getRequest);
				if (closeableHttpResponse.getStatusLine().getStatusCode()== 200) {
					isRequestSuccess = true;
				break;	
				}
			}
			if (!isRequestSuccess) {
				logger.error("Request has failed for uri:"+uri+", status code:"+closeableHttpResponse.getStatusLine().getStatusCode());
				throw new RuntimeException("Request call has failed for URI:"+uri+", status code:"+closeableHttpResponse.getStatusLine().getStatusCode());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return closeableHttpResponse;
	}

	@Override
	public CloseableHttpResponse get(String uri, String authToken) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
