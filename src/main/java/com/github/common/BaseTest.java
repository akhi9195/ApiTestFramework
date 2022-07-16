package com.github.common;

import java.util.Properties;

import org.apache.log4j.BasicConfigurator;  
import org.apache.log4j.LogManager;  
import org.apache.log4j.Logger;  

import com.github.util.GithubRestServiceImpl;
import com.github.util.GithubService;

public class BaseTest {
	protected GithubService httpHandler;
	protected static final String Log_file= "log4j.properties";
	protected static final Logger logger =  LogManager.getLogger(BaseTest.class);
	public BaseTest() {
		 httpHandler=new GithubRestServiceImpl();
		 Properties prop= new Properties();
		  BasicConfigurator.configure();  
		 
		 
	}
}
