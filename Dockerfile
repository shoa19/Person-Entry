FROM openjdk:21-ea-17-jdk
VOLUME /tmp
COPY /target/user-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
