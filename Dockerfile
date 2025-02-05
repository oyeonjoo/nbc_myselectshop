FROM openjdk:17-alpine

LABEL description="MySelectShop application built with Spring Boot"

WORKDIR /app

COPY ./build/libs/myselectshop-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
