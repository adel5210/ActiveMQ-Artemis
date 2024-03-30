# ActiveMQ artemis

### Commands
 ```
 # Run Artemis broker
 docker run --detach --name activemq_artemis -p 61616:61616 -p 8161:8161 --rm apache/activemq-artemis:latest-alpine
 # username: artemis
 # password: artemis
 docker exec -it <mycontainer> bash
./artemis user add --user-command-user adel --user-command-password 1234 --role admin --user adel --password 1234
 ```