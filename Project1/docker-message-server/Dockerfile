FROM openjdk:19

MAINTAINER baeldung.com

COPY target/docker-message-server-1.0.0.jar message-server-1.0.0.jar

EXPOSE 8888

ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]