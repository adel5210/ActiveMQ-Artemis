# ActiveMQ artemis

### Commands 1
 ```
 # Run Artemis broker
 docker run --detach --name activemq_artemis -p 61616:61616 -p 8161:8161 -p 5672:5672 -p 61613:61613 -p 61614:61614 --rm apache/activemq-artemis:latest-alpine
 # username: artemis
 # password: artemis
 docker exec -it <mycontainer> bash
./artemis user add --user-command-user adel --user-command-password 1234 --role admin --user adel --password 1234
 ```

### Commands 2
 ```
 # Docker build from custom image
 docker build -t custom-activemq-artemis .
 
 # Run Artemis broker
 docker run -p 61616:61616 -p 8161:8161 -p 5672:5672 -p 61616:61613 -p 61614:61614 custom-activemq-artemis
 ```