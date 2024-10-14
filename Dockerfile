FROM openjdk:21
EXPOSE 8080
ADD target/ecom-springboot.jar ecom-springboot.jar
ENTRYPOINT ["java", "-jar","ecom-springboot.jar"]