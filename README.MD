Basic Spring Boot Web application which interacts the application with browser

technologies : java 11, Gradle, Spring boot, JSP, Spring MVC basics

--Navigate to application location on command prompt:
Run "gradle clean eclipse" if you face any dependencies issues with tomcat-jasper jar

--application.properties under src/main/java takes care of views (JSP)

--Run the application and access on browser 
	
	http://localhost:8080/welcome-page
	
-- Send input from browser at URL
	
	i) http://localhost:8080/servlet-req-hello?name=JSP
	
	ii) http://localhost:8080/session-hello?input=SpringBoot
	
	iii) http://localhost:8080/req-param-hello?name=Gradle
	
	iv) http://localhost:8080/mvc-request?input_req=MVC
	
  
