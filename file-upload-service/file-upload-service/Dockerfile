FROM java:8
VOLUME /tmp
ADD target/*.jar file-upload-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
RUN sh -c 'touch /file-upload-service-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar","/file-upload-service-0.0.1-SNAPSHOT.jar"]
