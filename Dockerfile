FROM gradle:7-jdk11 AS build
COPY --chown=gradle:gradle src /home/gradle/src
WORKDIR /home/gradle/src
RUN geadle buildFatJar --no-daemon

FROM openjdk:11
EXPOSE 8080:8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/link-saver_server.jar
ENTRYPOINT ["java","-jar","/app/ktor-UncleJacksApp.jar"]