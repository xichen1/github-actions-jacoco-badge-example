![Coverage](.github/badges/jacoco.svg)

A minimal Dropwizard getting started project using Gradle. Use [shadowJar plugin](https://github.com/johnrengelman/shadow) to create fat jars.

To create a fat jar:

```
./gradlew shadowJar
```

To run your application:

```
java -jar build/libs/hello-friends-1.0-SNAPSHOT.jar server hello-world.yml
```

To build and run your application:

```
./gradlew runServer
```

This command runs both first two commands above. There will be gradle output stuck at the bottom of the output and it is normal.

#### Server

Server is accessible at `localhost:8085`. Port can be configured inside `hello-world.yml`.

#### Resources

- [Dropwizard - Getting Start](https://www.dropwizard.io/en/stable/getting-started.html)

#### Reference

The original project is created by cakraww and is stored at [dropwizard-gradle](https://github.com/cakraww/dropwizard-gradle) repo.
This repo contains only the adjusted version of the other one, only for learning purposes.

