FROM openjdk:11.0.6-jre-buster
LABEL maintainer=debora
WORKDIR /app
COPY libs libs/
COPY resources resources/
COPY classes classes/
ENTRYPOINT ["java", "-cp", "/app/resources:/app/classes:/app/libs/*", "com.olxbr.greenbook.GreenBookApplication"]
EXPOSE 8080
