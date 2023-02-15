FROM openjdk:17

COPY ./build/libs/weather-0.0.1-SNAPSHOT.jar /var/tmp/weather.jar
# WORKDIR /var/tmp/
RUN chmod +x /var/tmp/weather.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","/var/tmp/weather.jar"]

