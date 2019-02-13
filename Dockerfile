FROM openjdk:8-jdk-alpine

RUN adk add -no-cahche ca-certifcates
ADD https://get.aquasec.com/microscanner /
RUN chmod +x /microscanner
ARG token
RUN /microscanner ${token} && rm -f /microscanner && adk del ca-certificates

COPY ./build/libs/wahhoi-0.0.1-SNAPSHOT.jar /home/wahhoi.jar

ENTRYPOINT [ "java", "-jar", "/home/wahhoi.jar" ]
