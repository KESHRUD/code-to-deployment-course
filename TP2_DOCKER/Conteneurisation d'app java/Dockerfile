# compilation
FROM eclipse-temurin:21-jdk AS builder

WORKDIR /app

COPY Hello.java .

RUN javac Hello.java

# exécution
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=builder /app/Hello.class .

CMD ["java", "Hello"]