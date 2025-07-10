# Leyden Demo

This demo is designed to give a high-level overview of the how to use project Leyden's features, as well as the issues it's attempting to address. 

## Demo Part 1


```
less leyden/JITExample.java

javap -verbose leyden/JITExample

java -XX:CompileCommand=PrintCompilation,'leyden.JITExample::*' leyden/JITExample.java 1000

java leyden/JITExample.java 10 true

java -XX:AOTCacheOutput=jit-example.aot -Xlog:aot leyden/JITExample.java 10

java -XX:AOTCache=jit-example.aot -Xlog:aot leyden/JITExample.java 10

java -XX:+PrintSharedArchiveAndExit -XX:AOTCache=jit-example.aot
```

## Demo Part 2

For this demo you will need to download and build the Spring Boot Petclinic test application; which can be found here: https://github.com/spring-projects/spring-petclinic. You will also need the oha command line tool: https://github.com/hatoo/oha.


```
java -jar target/spring-petclinic-3.5.0-SNAPSHOT.jar

java -XX:AOTCacheOutput=app.aot  -Dspring.context.exit=onRefresh -jar target/spring-petclinic-3.5.0-SNAPSHOT.jar

java -XX:AOTCache=app.aot -jar target/spring-petclinic-3.5.0-SNAPSHOT.jar

java -XX:AOTCacheOutput=app-with-load.aot -jar target/spring-petclinic-3.5.0-SNAPSHOT.jar

java -XX:AOTCache=app-with-load.aot -jar target/spring-petclinic-3.5.0-SNAPSHOT.jar

oha -z5s http://localhost:8080/vets.html
```

