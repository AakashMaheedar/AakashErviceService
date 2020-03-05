FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/aakashervice.jar aakashervice.jar
ENTRYPOINT ["java","-jar","aakashervice.jar"]