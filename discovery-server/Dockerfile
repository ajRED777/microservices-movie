FROM openjdk:8

ARG JAR_FILE=target/*.jar

RUN mkdir /opt/discovery-server

COPY ${JAR_FILE} /opt/discovery-server/app.jar

ENTRYPOINT ["java", "-jar", "/opt/discovery-server/app.jar"]