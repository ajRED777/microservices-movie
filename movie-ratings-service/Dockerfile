FROM openjdk:8

ARG JAR_FILE=target/*.jar

RUN mkdir /opt/movie-ratings-service

COPY ${JAR_FILE} /opt/movie-ratings-service/app.jar

ENTRYPOINT ["java", "-jar", "/opt/movie-ratings-service/app.jar"]