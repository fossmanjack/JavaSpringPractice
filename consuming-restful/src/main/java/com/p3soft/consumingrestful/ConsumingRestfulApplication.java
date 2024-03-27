package com.p3soft.consumingrestful;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestfulApplication {
	private static final Logger logger = LoggerFactory.getLogger(ConsumingRestfulApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestfulApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	@Profile("!test")
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Insult insult = restTemplate.getForObject("https://evilinsult.com/generate_insult.php?lang=en&type=json", Insult.class);
			logger.info(insult.toString());
		};
	}

}
