FROM java:8
VOLUME /tmp
ADD target/*.jar BugProject-0.0.1-SNAPSHOT.jar
EXPOSE 8080
RUN sh -c 'touch /BugProject-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar","/BugProject-0.0.1-SNAPSHOT.jar"]
