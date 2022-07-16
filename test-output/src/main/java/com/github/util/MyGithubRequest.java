package com.github.util;

//@ToString
//@Getter
//@Builder
 public class MyGithubRequest {
	private String resource;
	private	String repositoryType;
	private	String language;
	private	String multyLanguages;
	private	String sortType;
	private	String orderType;
	private	String userName;
	public MyGithubRequest(MyGithibRequestBuilder builder) {
		this.resource = builder.resource;
		
		this.repositoryType = builder.repositoryType;
		this.language = builder.language;
		this.sortType = builder.sortType;
		this.orderType = builder.orderType;
		this.multyLanguages = builder.multyLanguages;
		this.userName=builder.userName;
	}
	
	public String getMultyLanguages() {
		return multyLanguages;
	}
	

	public String getUserName() {
		return userName;
	}

	public String getResource() {
		return resource;
	}

	public String getRepositoryType() {
		return repositoryType;
	}

	public String getLanguage() {
		return language;
	}

	public String getSortType() {
		return sortType;
	}

	public String getOrderType() {
		return orderType;
	}

	public static class MyGithibRequestBuilder{
		 String resource;
			String repositoryType;
			String language;
			String sortType;
			String orderType;
			String userName;
			String multyLanguages;
	public MyGithibRequestBuilder(){
				
			}
			
	public MyGithibRequestBuilder setResource(String resource) {
		this.resource = resource;
		return this;
	}
	
	public MyGithibRequestBuilder setRepositoryType(String repositoryType) {
		this.repositoryType = repositoryType;
		return this;
	}
	
	public MyGithibRequestBuilder setLanguage(String language) {
		this.language = language;
		return this;
	}
	public MyGithibRequestBuilder setMultyLanguages(String multyLanguages) {
		this.multyLanguages = multyLanguages;
		return this;
	}
	
	public MyGithibRequestBuilder setSortType(String sortType) {
		this.sortType = sortType;
		return this;
	}
	
	public MyGithibRequestBuilder setOrderType(String orderType) {
		this.orderType = orderType;
		return this;
	}
	public MyGithibRequestBuilder setuserName(String userName) {
		this.userName = userName;
		return this;
	}
	
	public MyGithubRequest build() {
		MyGithubRequest request = new MyGithubRequest(this);
		return request;
	}
	 }
	@Override
	public String toString() {
		return "MyGithubRequest [resource=" + resource + ", repositoryType=" + repositoryType + ", language=" + language
				+ ", multyLanguages=" + multyLanguages + ", sortType=" + sortType + ", orderType=" + orderType + "]";
	}

	

	
	
	
}
