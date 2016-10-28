#Config-server

##Introduction

   A sample of spring config-server ready to run standalone or at a Docker environment.
   Depends on a Rabbit instance to amqp bus
   
##Repository

   The config repo used here must have at least **configserver.yml** with the configserver configurations.
   A repo sample:
   /https://github.com/RichardCSantana/configserver-repo

##Running 

###Using spring-boot maven plugin:

* On Windows:

```
mvnw.cmd spring-boot:run -Dspring.cloud.config.server.git.uri=<config_repo>
```

* On Linux/MacOS:

```
./mvnw spring-boot:run -Dspring.cloud.config.server.git.uri=<config_repo>
```

###Using compiled version:

####Compile:
  * On Windows:

```
mvnw.cmd clean package
```

  * On Linux/MacOS:

```
./mvnw clean package
```

####Run:

```
java -jar target/configserver-0.0.1-SNAPSHOT.jar --spring.cloud.config.server.git.uri=<config_repo>
```

###Build on Docker:

####Compile:
* On Windows:

```
mvnw.cmd clean package docker:build
```

  * On Linux/MacOS:

```
./mvnw clean package docker:build
```