package com.adel.activemq.artemis;

import com.adel.activemq.artemis.producer.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Random;

@SpringBootApplication
@RequiredArgsConstructor
public class ArtemisApplication implements CommandLineRunner {

	private final ProducerService producerService;
	private final ConfigurableApplicationContext applicationContext;

	public static void main(String[] args) {
        SpringApplication.run(ArtemisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		producerService.publish("test_"+ new Random().nextLong());
//		applicationContext.close();
	}
}
