# Fase de construcción
FROM maven:3.8.5 AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# Fase de ejecución usando radut/openjdk:21
FROM amazoncorretto:17
WORKDIR /app
COPY --from=build /app/target/HexaPaymentDemo-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
