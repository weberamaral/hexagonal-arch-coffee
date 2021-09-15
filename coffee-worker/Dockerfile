FROM openjdk:11-jdk-slim
COPY build/libs/coffee-worker.jar lib/coffee-worker.jar

EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "lib/coffee-worker.jar" ]
