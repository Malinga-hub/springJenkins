FROM openjdk:21-slim

WORKDIR /opt/app

COPY build/libs/*SNAPSHOT.jar app.jar

EXPOSE 8090

CMD ["java", "-jar", "app.jar"]