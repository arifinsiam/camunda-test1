FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} camunda-test1.jar
ENTRYPOINT ["java","-jar","/camunda-test1.jar"]