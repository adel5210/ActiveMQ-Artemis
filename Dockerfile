# Use official ActiveMQ Artemis base image
FROM vromero/activemq-artemis

# Remove default broker.xml
RUN rm -f /var/lib/artemis-instance/etc/broker.xml

#Add custom broker.xml
ADD broker.xml /var/lib/artemis/etc/broker.xml

#Expose ports
EXPOSE 8161 61616 5672 61613