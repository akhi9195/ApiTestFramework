package com.github.test;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.common.BaseTest;
import com.github.common.Common;
import com.github.pojo.responseDto.userRepo.Project;
import com.github.util.MyGithubRequest;

public class UserRepoTest extends BaseTest{
	
	@Test
	public void validate_user_repository_count() {
		Properties prop = Common.readPropertiesFile();
		MyGithubRequest request = new MyGithubRequest.
				MyGithibRequestBuilder()
				.setResource("users")
				.setuserName(prop.getProperty("username1"))
				.build();
		
		Project[] response =httpHandler.getUserRepoDetails(request);
		
		int expeted_user_repo = Integer.parseInt(prop.getProperty("username1_repo_count"));
		logger.info("Expected repo count:"+expeted_user_repo);
		int actual_user_repo= response.length;
		
		Assert.assertTrue(actual_user_repo== expeted_user_repo,"Expected and Actual repo count is not matching for user1:"+prop.getProperty("username1"));
	}
	
	@Test
	public void validate_user_fullName() {
		Properties prop = Common.readPropertiesFile();
		MyGithubRequest request = new MyGithubRequest.
				MyGithibRequestBuilder()
				.setResource("users")
				.setuserName(prop.getProperty("username1"))
				.build();
		
		Project[] response =httpHandler.getUserRepoDetails(request);
		
		String expeted_user_fullName =prop.getProperty("username1_fullName");
		System.out.println("Expected repo count:"+expeted_user_fullName);
		
		for (int i = 0; i < response.length; i++) {
			Assert.assertTrue(response[i].getFull_name().contains(expeted_user_fullName),"Expected and Actual repo user full name is not matching for user:"+prop.getProperty("username1")+", for following Project:"+response[i].getName());
		}
		
		
	}
}
