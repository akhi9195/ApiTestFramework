package com.github.util;

import org.apache.http.client.methods.CloseableHttpResponse;

import com.github.pojo.responseDto.search.SearchRepositoryDto;
import com.github.pojo.responseDto.userRepo.Project;

public interface HttpUtil {

	CloseableHttpResponse get(String uri);
	CloseableHttpResponse get(String uri,String authToken);
	
}
