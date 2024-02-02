FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar .task-trackerjar
ENTRYPOINT ["java","-jar","/task-tracker.jar"]
EXPOSE 8080