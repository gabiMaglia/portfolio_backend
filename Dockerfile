FROM amazoncorretto:11-alpine-jdk
VOLUME /tmp
EXPOSE 8080
MAINTAINER gabrielsk
ARG JAR_FILE=target/Gabriel-Maglia-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]