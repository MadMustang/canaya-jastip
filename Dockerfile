FROM openjdk:8-jdk-alpine

MAINTAINER aelous

EXPOSE 8080

COPY target/jastip-0.0.1-SNAPSHOT.jar jastip-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/jastip-0.0.1-SNAPSHOT.jar"]