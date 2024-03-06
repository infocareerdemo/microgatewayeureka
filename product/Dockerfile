FROM openjdk:17

COPY target/productservice.jar /user/app/

WORKDIR /user/app/

ENTRYPOINT ["java", "-jar", "productservice.jar"]