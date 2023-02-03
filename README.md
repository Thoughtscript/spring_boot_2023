# Spring Boot 2023

[![](https://img.shields.io/badge/Spring%20Boot-3.0.2-green.svg)](https://spring.io/projects/spring-boot)
[![](https://img.shields.io/badge/Gradle-7.5.1-darkslategray.svg)](https://gradle.org/)
[![](https://img.shields.io/badge/Maven-3.8.6-white.svg)](https://maven.apache.org/download.cgi)
[![](https://img.shields.io/badge/Docker-blue.svg)](https://www.docker.com/) 
[![](https://img.shields.io/badge/Postgres-13.0-lightblue.svg)](https://hub.docker.com/_/postgres)

## Use

Maven:
```bash
mvn clean
mvn install
mvn spring-boot:run
```

Gradle:
```bash
./gradlew clean
./gradlew build
./gradlew run
```

SSL:
```bash
keytool -genkey \
  -alias bootexample \
  -keystore bootexample.p12 \
  -storetype PKCS12 \
  -keyalg RSA \
  -storepass af3DF*34afefwefehu \
  -validity 730 \
  -keysize 4096
```

## API

```
GET https://localhost:8080/api/example/all
```

```
GET https://localhost:8080/api/relations/one/all
```

```
GET https://localhost:8080/api/relations/many/all
```

## Resources and Links

1. https://www.codejava.net/frameworks/spring-boot/connect-to-postgresql-database-examples
2. https://www.baeldung.com/spring-boot-security-autoconfiguration
3. https://www.baeldung.com/spring-postconstruct-predestroy
