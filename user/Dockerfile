FROM openjdk:17

COPY target/userservice.jar /user/app/

WORKDIR /user/app/

ENTRYPOINT ["java", "-jar", "userservice.jar"]