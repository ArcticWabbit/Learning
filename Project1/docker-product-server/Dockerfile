FROM openjdk:19

MAINTAINER baeldung.com

COPY target/docker-product-server-1.0.0.jar product-server-1.0.0.jar

EXPOSE 9999

ENTRYPOINT ["java","-jar","/product-server-1.0.0.jar"]