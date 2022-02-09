FROM openjdk:8

ARG JAR_FILE=target/*.jar

RUN mkdir /opt/movie-catalog-service

COPY ${JAR_FILE} /opt/movie-catalog-service/app.jar

ENTRYPOINT ["java", "-jar", "/opt/movie-catalog-service/app.jar"]