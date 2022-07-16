package com.github.util;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.common.BaseTest;
import com.github.pojo.responseDto.search.SearchRepositoryDto;
import com.github.pojo.responseDto.userRepo.Project;

public class GithubRestServiceImpl implements GithubService {

	String  baseUri ="https://api.github.com/";
	HttpUtil httpHandler = new HttpClientImpl();	
	private static final Logger logger =  LogManager.getLogger(GithubRestServiceImpl.class);
	
	public SearchRepositoryDto getSearchRepository(MyGithubRequest request) {
		ObjectMapper mapper = new ObjectMapper();
		SearchRepositoryDto response = null;

		try(CloseableHttpResponse  closeableHttpResponse = httpHandler.get(getSearchEndpoint(request))) {
				response=	mapper.readValue(closeableHttpResponse.getEntity().getContent(), SearchRepositoryDto.class);
		} 
		catch (StreamReadException e) {
			e.printStackTrace();
		} catch (DatabindException e) {
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	

		return response;
	}

	public Project[] getUserRepoDetails(MyGithubRequest request) {
		ObjectMapper mapper = new ObjectMapper();
		Project[] response = null;
		CloseableHttpResponse  closeableHttpResponse = httpHandler.get(getUserRepoEndpoint(request));

		try {
			response=	mapper.readValue(closeableHttpResponse.getEntity().getContent(), Project[].class);
		} catch (StreamReadException e) {
			e.printStackTrace();
		} catch (DatabindException e) {
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		return response;
	}
	private String getLanguagesQueryParam(MyGithubRequest request) {
		StringBuilder sb = new StringBuilder();
		String[] languages = request.getMultyLanguages().split(",");
		for (String language : languages) {
			sb.append("+language:"+language);
		}
		String languagURI= sb.toString();
		//System.out.print(""+languagURI);
		logger.info(""+languagURI);
		return languagURI; 
	}
	private String getSearchEndpoint(MyGithubRequest request) {
		String uri=baseUri+request.getResource()+"?q="+request.getRepositoryType();
		StringBuilder sb = new StringBuilder();

		if (request.getMultyLanguages()!=null) {
			String languesQueryParam = getLanguagesQueryParam(request);
			uri= uri+languesQueryParam;
		} 
		if(request.getLanguage() !=null) {
			uri= uri+"+language:"+request.getLanguage();
		}
		if(request.getSortType() !=null) {
			uri= uri+"&sort="+request.getSortType();
		}
		if(request.getOrderType() !=null) {
			uri= uri+"&order="+request.getOrderType();
		}
		//System.out.println("search endpoint:"+uri);
		//logger.info("search endpoint"+uri);
		return uri; 
	}

	private String getUserRepoEndpoint(MyGithubRequest request) {
		String uri=baseUri+request.getResource()+"/"+request.getUserName()+"/repos";
		System.out.println("User Repo endpoint:"+uri);
		return uri; 
	}

}
