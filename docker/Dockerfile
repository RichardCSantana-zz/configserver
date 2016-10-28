FROM java:8
MAINTAINER Richard Santana
ADD *.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080