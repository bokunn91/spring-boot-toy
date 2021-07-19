FROM amazoncorretto:11 AS builder
ARG JAR_FILE=build/libs/*.jar

COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

RUN chmod +x ./gradlew
RUN ./gradlew

FROM amazoncorretto:11

COPY --from=builder ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
