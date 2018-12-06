FROM openjdk:12

ARG PROXY
ARG OPENAPI_SPEC_FILE
ARG GENERATE_LANG

ENV http_proxy=$PROXY
ENV https_proxy=$PROXY
ENV GENERATE_LANG=$GENERATE_LANG

WORKDIR /home

RUN set -x && \
    yum install wget -y && \
    wget http://central.maven.org/maven2/org/openapitools/openapi-generator-cli/3.3.4/openapi-generator-cli-3.3.4.jar -O openapi-generator-cli.jar

COPY ${OPENAPI_SPEC_FILE} /home/openapi.yml

CMD java -jar ./openapi-generator-cli.jar generate -i /home/openapi.yml -o /home/out -l $GENERATE_LANG
