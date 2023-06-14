FROM openjdk:11
COPY "./target/rifa_bakend-0.0.1-SNAPSHOT.jar" "rifa_backend.jar"
EXPOSE 80
ENTRYPOINT ["java", "-jar", "rifa_backend.jar"]

