
#FROM openjdk:17

#COPY target/gatewayservice.jar /user/app/

#WORKDIR /user/app/

#ENTRYPOINT ["java", "-jar", "gatewayservice.jar"]


FROM openjdk:17

# Set the working directory inside the container
EXPOSE 8083

ADD /target/gatewayservice.jar gatewayservice.jar

# Command to run your Gateway service when the container starts
ENTRYPOINT ["java", "-jar", "gatewayservice.jar"]
