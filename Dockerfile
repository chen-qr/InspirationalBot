FROM openjdk:21-jdk-slim as build

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} InspirationalBot.jar

CMD java $JAVA_OPTS --enable-preview -jar /InspirationalBot.jar