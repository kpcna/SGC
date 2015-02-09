If you are using Maven, you can run the application using 
mvn spring-boot:run. 


Or you can build the JAR file with mvn clean package and run the JAR by typing:
java -jar target/gs-rest-service-0.1.0.jar


http://www.mkyong.com/maven/how-to-create-a-web-application-project-with-maven/
//for example 
$ mvn archetype:generate -DgroupId=com.mkyong 
	-DartifactId=CounterWebApp 
	-DarchetypeArtifactId=maven-archetype-webapp 
	-DinteractiveMode=false


http://spring.io/guides/gs/rest-service/