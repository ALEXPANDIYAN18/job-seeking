FROM maven:3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/jobseeking-0.0.1-SNAPSHOT.war jobseeking.war

ENTRYPOINT ["java", "-jar", "jobseeking.war"]
