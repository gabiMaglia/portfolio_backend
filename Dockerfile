FROM amazoncorretto:11-alpine-jdk
MAINTAINER GabrielsK
COPY target/Gabriel-Maglia-0.0.1-SNAPSHOT.jar Gabriel-Maglia-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Gabriel-Maglia-0.0.1-SNAPSHOT.jar"]