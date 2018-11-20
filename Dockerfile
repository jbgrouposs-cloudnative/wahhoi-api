FROM openjdk:8-jdk-alpine

COPY ./build/libs/wahhoi-0.0.1-SNAPSHOT.jar /home/wahhoi.jar

ENTRYPOINT [ "java", "-jar", "/home/wahhoi.jar" ]
