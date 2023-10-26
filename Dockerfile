FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/jobseeking-0.0.1-SNAPSHOT.war jobseeking.war
EXPOSE 8080
CMD uvicorn webservice:app --host 0.0.0.0 --port $PORT
ENTRYPOINT ["java", "-jar", "jobseeking.war"]

