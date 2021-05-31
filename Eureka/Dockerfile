FROM java:8
VOLUME /tmp
ADD target/*.jar Eureka-0.0.1-SNAPSHOT.jar
EXPOSE 8080
RUN sh -c 'touch /Eureka-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar","/Eureka-0.0.1-SNAPSHOT.jar"]
