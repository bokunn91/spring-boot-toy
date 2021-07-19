FROM amazoncorretto:11 AS builder
WORKDIR /app

COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

RUN chmod +x gradlew
RUN ./gradlew clean bootJar


FROM amazoncorretto:11
WORKDIR /app
ARG JAR_FILE=/app/build/libs/*.jar

COPY --from=builder ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
