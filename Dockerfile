FROM openjdk:11


ARG XMX=500m

ENV XMX=$XMX


VOLUME /tmp


EXPOSE 8900

ADD ./target/rifa_bakend-0.0.1-SNAPSHOT.jar rifa_bakend.jar

ENTRYPOINT java -Xmx$XMX -jar /rifa_bakend.jar  
