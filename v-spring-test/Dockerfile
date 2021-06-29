FROM openjdk:11
EXPOSE 8080
VOLUME /tmp
ADD target/vspringtest-0.0.1-SNAPSHOT.jar target/app.jar
RUN bash -c 'touch target/app.jar'
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=local","target/app.jar"]
