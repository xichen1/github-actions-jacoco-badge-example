# Get the Gradle image so we can build JAR file first
FROM gradle:4.7.0-jdk8-alpine AS build

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew shadowJar

# Get the Java version 8 image
FROM java:8

WORKDIR /app
COPY --from=build /home/gradle/src/build/libs/hello-friends-1.0-SNAPSHOT.jar /app
COPY hello-world.yml /app

# "EXPOSE" only exposes the container's port to be visible to others, but not to host.
# We will map ports inside docker-compose.yml
EXPOSE 8085
EXPOSE 8081

CMD ["java", "-jar","hello-friends-1.0-SNAPSHOT.jar","server","hello-world.yml"]

