FROM openjdk:8

ARG JAR_FILE=target/*.jar

RUN mkdir /opt/movie-info-service

COPY ${JAR_FILE} /opt/movie-info-service/app.jar

ENTRYPOINT ["java", "-jar", "/opt/movie-info-service/app.jar"]