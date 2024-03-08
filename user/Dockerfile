

FROM openjdk:17

# Set the working directory inside the container
EXPOSE 8081

ADD /target/userservice.jar userservice.jar

# Command to run your Gateway service when the container starts
ENTRYPOINT ["java", "-jar", "userservice.jar"]