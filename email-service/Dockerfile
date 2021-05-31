FROM java:8
VOLUME /tmp
ADD target/*.jar email-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
RUN sh -c 'touch /email-service-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar","/email-service-0.0.1-SNAPSHOT.jar"]
