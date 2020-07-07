FROM openjdk:8-jdk-alpine
EXPOSE 6092
WORKDIR /app 
COPY target/rabbitmq-consumer-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "rabbitmq-consumer-0.0.1-SNAPSHOT.jar" ]
