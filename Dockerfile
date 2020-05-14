FROM recapscsb/scsb-base:latest
MAINTAINER HTC ReCAP Support "recap-support@htcindia.com"

ADD target/mockServer.jar mockServer.jar

EXPOSE 8090
ENTRYPOINT ["java","-jar",mockServer.jar"]