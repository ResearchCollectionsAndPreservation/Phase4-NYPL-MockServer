#FROM recapscsb/scsb-base:latest
FROM phase4-scsb-base:latest
MAINTAINER HTC ReCAP Support "recap-support@htcindia.com"

ARG TAG
ENV envTag="$TAG"
COPY shellBuild.sh /opt/
RUN chmod 750 /opt/shellBuild.sh
RUN cd /opt && ls -l && ./shellBuild.sh ${envTag}

EXPOSE 9101

ENTRYPOINT java -jar -Denvironment=$ENV /opt/mockServer-0.0.1-SNAPSHOT.jar && bash
