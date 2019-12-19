FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/dockerhelloworld-0.0.1-SNAPSHOT.jar /home/dockerhelloworld-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["/bin/sh", "-c", "java -jar /home/dockerhelloworld-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java", "-jar",  "/home/dockerhelloworld-0.0.1-SNAPSHOT.jar"]