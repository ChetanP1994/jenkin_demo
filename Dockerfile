FROM openjdk:8
EXPOSE 8080
ADD target/docker_jenkin_demo.jar docker_jenkin_demo.jar
ENTRYPOINT ["java", "-jar", "/docker_jenkin_demo.jar"]
