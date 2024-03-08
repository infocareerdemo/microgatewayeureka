
FROM openjdk:17

# Set the working directory inside the container
EXPOSE 8082

ADD /target/productservice.jar productservice.jar

# Command to run your Gateway service when the container starts
ENTRYPOINT ["java", "-jar", "productservice.jar"]