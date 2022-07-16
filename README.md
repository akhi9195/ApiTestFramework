# ApiTestFramework
This project is to demonstrate how to test any API with Java as programming language and TestNg as testing framework, and any API client library (HttpClient, can be switch to any other library).  


Architecture:
Programming Language: Java 8
Testing framework: TestNG
Design Pattern: Builder design for request forwarding. Page object pattern for each independent api validations.
Http library: Integrated with HttpClient in losse couple approach. This framework can be easily switch  to any any other test library without modifying existing test scripts. 
Json Deserialization: Jackson API
Log: Log4j
Report: Allure

 
src/test:
 contains following 2 test suites.
1. Github Search Test [4 test cases]
2. Github User Repo Test [2 test cases]


src/main:
  following are main components
  
  1.PoJos: Deserialization of Json response into Java objects using Jackson API.
  2.Common: Common functionalities like file reading and BaseTest to hold common tasks across the test classes.
  3.Util: It has 2 interfaces to maintain loose couple between api test library & test cases.
      1.HttpUtil -> Implements by HttpClientImpl: which provide implation to http methods at the low level.
      2.GithubService -> implements by GithubServiceImple: Which provide implementation at github service level which internally uses HttpUtil impl. In future, if the user wants to switch to any new library, that can be easily done here by following new HttpUtil Impl class.	  
	  
	  
Execution Flow:
	 src/test/SearchTest test case -> GithubServiceImpl -> HttpClientImple  -> Once after successful request execution, response will be desearilized and send back to test class for validations.
