FROM gradle:8.14.2-jdk21 AS build
COPY --chown=gradle:gradle . /app
WORKDIR /app
RUN gradle bootJar --no-daemon

FROM mcr.microsoft.com/openjdk/jdk:21-distroless
WORKDIR /app
COPY --from=build /app/build/libs/*jar backend.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "backend.jar"]

# docker build -t backend .
# docker run -d --name backend-container -p 8080:8080 backend