FROM ubuntu
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
RUN apt-get update && apt-get install -y gradle
COPY . /usr/src/app
RUN chmod +x /usr/src/app/bin/linux-x86-64/sonar.sh /usr/src/app/bin/linux-x86-64/wrapper
EXPOSE 9000
CMD /usr/src/app/bin/linux-x86-64/sonar.sh console
