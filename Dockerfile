FROM openjdk:8-jdk-alpine
COPY ./target/my-java-project-1.0-SNAPSHOT.jar /usr/src/myapp/
WORKDIR /usr/src/myapp
CMD ["java", "-jar", "my-java-project-1.0-SNAPSHOT.jar"]

