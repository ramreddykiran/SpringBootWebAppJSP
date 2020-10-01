Basic Spring Boot Web application which interacts the application with browser
technologies : java 11, Gradle, Spring boot, JSP
--Navigate to application location on command prompt:
Run "gradle clean eclipse" if you face any dependencies issues with tomcat-jasper jar
--application.properties under src/main/java takes care of views (JSP)
--Run the application and access on browser 
	http://localhost:8080/welcome-page
-- Send input from browser at URL
	http://localhost:8080/hello?name=Kiran
  
