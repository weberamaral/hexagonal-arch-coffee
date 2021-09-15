#FROM gradle:6.8-jdk11 as build
#COPY . /home/src/java
#WORKDIR /home/src/java
#
#USER root
#RUN chown -R gradle /home/src/java
#USER gradle
#RUN gradle clean build
#
#FROM openjdk:11-jdk-slim
#WORKDIR /home/app/java
#COPY --from=build "home/src/java/build/libs/restaurant-api.jar" .
#EXPOSE 8081
#ENTRYPOINT [ "java", "-jar", "/home/app/java/restaurant-api.jar" ]

FROM openjdk:11-jdk-slim
COPY build/libs/coffee-api.jar lib/coffee-api.jar

EXPOSE 8081
ENTRYPOINT [ "java", "-jar", "lib/coffee-api.jar" ]
