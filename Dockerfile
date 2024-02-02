FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/task-tracker-0.0.1-SNAPSHOT.jar task-tracker.jar
ENTRYPOINT ["java","-jar","/task-tracker.jar"]
EXPOSE 8080