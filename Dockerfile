FROM openjdk:17-alpine
COPY target/spring-boot-tutorial-0.0.1.jar spring-boot-tutorial-0.0.1.jar
ENTRYPOINT ["java","-jar","/spring-boot-tutorial-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081
