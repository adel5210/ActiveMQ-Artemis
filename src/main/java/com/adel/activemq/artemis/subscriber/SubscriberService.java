package com.adel.activemq.artemis.subscriber;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SubscriberService {

    @JmsListener(destination = "CONSUMER_0")
    public void listen(final String message){
        log.info("Listener receives message {}", message);
    }

}
