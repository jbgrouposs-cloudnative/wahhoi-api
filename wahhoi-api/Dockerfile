FROM openjdk:8-jre-alpine

COPY ./build/libs/wahhoi-0.0.1-SNAPSHOT.jar /home/wahhoi.jar

#ENV spring.datasource.url=jdbc:mysql://hostname:3306/wahhoi\
#    spring.datasource.username=root\
#    spring.datasource.password=letswahhoi\
#    spring.datasource.driverClassName=com.mysql.jdbc.Driver

EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/home/wahhoi.jar" ]
