FROM maven:3-jdk-8 AS build

WORKDIR /usr/app

COPY . ./

RUN mvn install


FROM openjdk:8-alpine

EXPOSE 9999

COPY --from=build /usr/app /usr/app

ENTRYPOINT ["java","-jar","/usr/app/target/helloworld-0.0.1-SNAPSHOT.jar"]