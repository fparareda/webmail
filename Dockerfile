FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/web-0.0.1-SNAPSHOT.jar web.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/web.jar"]