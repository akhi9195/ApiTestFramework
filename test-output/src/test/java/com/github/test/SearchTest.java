package com.github.test;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.common.BaseTest;
import com.github.common.Common;
import com.github.pojo.responseDto.search.SearchRepositoryDto;
import com.github.util.GithubService;
import com.github.util.GithubRestServiceImpl;
import com.github.util.MyGithubRequest;

public class SearchTest extends BaseTest{

	@Test
	public void validate_java_seleniium_repository_count() {

		MyGithubRequest request = new MyGithubRequest.
				MyGithibRequestBuilder().
				setResource("search/repositories").
				setRepositoryType("selenium").
				setLanguage("java").
				setSortType("stars").
				setOrderType("desc").
				build();

		SearchRepositoryDto response =httpHandler.getSearchRepository(request);

		Properties prop = Common.readPropertiesFile();
		String expeted_total_java_selenium_repo_count = prop.getProperty("total_java_selenium_repo_count");


		Assert.assertEquals(response.getTotal_count(), expeted_total_java_selenium_repo_count,"Expected and Actual repo count is not matching for selenium with Java repo.");
	}
	@Test
	public void validate_python_seleniium_repository_count() {

		MyGithubRequest request = new MyGithubRequest.
				MyGithibRequestBuilder().
				setResource("search/repositories").
				setRepositoryType("selenium").
				setLanguage("python").
				build();

		SearchRepositoryDto response =httpHandler.getSearchRepository(request);

		Properties prop = Common.readPropertiesFile();
		int expeted_total_python_selenium_repo_count = Integer.parseInt(prop.getProperty("total_python_selenium_repo_count"));
		int actual_total_python_selenium_count= Integer.parseInt(response.getTotal_count());

		Assert.assertTrue(actual_total_python_selenium_count>= expeted_total_python_selenium_repo_count,"Expected and Actual repo count is not matching for selenium with Python repo.");
	}

	@Test
	public void validate_most_starred_seleniium_java_repository() {

		MyGithubRequest request = new MyGithubRequest.
				MyGithibRequestBuilder().
				setResource("search/repositories").
				setRepositoryType("selenium").
				setLanguage("java").
				setSortType("stars").
				build();

		SearchRepositoryDto response =httpHandler.getSearchRepository(request);

		Properties prop = Common.readPropertiesFile();
		String expeted_most_starred_seleniium_java_repository = prop.getProperty("most_popular_java_repo");
		String actual_most_starred_seleniium_java_repository = response.getItems().get(0).getFull_name();

		Assert.assertEquals(actual_most_starred_seleniium_java_repository, expeted_most_starred_seleniium_java_repository,"Expected and Actual repo name is not matching for selenium with Java most starred repo.");
	}

	@Test
	public void validate_python_and_java_seleniium_repository_count() {
		GithubRestServiceImpl httpHandler=new GithubRestServiceImpl();

		MyGithubRequest request = new MyGithubRequest.
				MyGithibRequestBuilder().
				setResource("search/repositories").
				setRepositoryType("selenium").
				setMultyLanguages("python,java").
				setSortType("stars").
				setOrderType("desc").
				build();

		SearchRepositoryDto response =httpHandler.getSearchRepository(request);

		Properties prop = Common.readPropertiesFile();
		int expeted_total_java_python_selenium_repo_count = Integer.parseInt(prop.getProperty("total_java_python_selenium_repo_count"));
		int actual_total_java_python_selenium_count= Integer.parseInt(response.getTotal_count());

		Assert.assertTrue(actual_total_java_python_selenium_count>= expeted_total_java_python_selenium_repo_count,"Expected and Actual repo count is not matching for selenium with Python repo.");
	}

}

