#FROM openjdk:17
#EXPOSE 8761
#ADD /target/eurekaserver.jar eurekaserver.jar
#ENTRYPOINT ["java","-jar","eurekaserver.jar"]


FROM openjdk:17

EXPOSE 8761

# Copy application properties file
#COPY src/main/resources/application.properties /app/application.properties

# Copy the Eureka server JAR file into the container
ADD /target/eurekaserver.jar eurekaserver.jar

# Command to run your Eureka server when the container starts
ENTRYPOINT ["java", "-jar", "eurekaserver.jar"]
