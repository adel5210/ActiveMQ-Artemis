package com.adel.activemq.artemis.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProducerService {

    private final JmsTemplate jmsTemplate;

    public void publish(final String message){
        jmsTemplate.convertAndSend("CONSUMER_0", message);
        log.info("Publish to CONSUMER_0, message {}", message);
    }
}
