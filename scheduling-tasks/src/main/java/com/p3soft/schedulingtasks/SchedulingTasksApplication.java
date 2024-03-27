package com.p3soft.schedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication // convenience annotation -- see restful-web-service
@EnableScheduling // ensures a background task executor is created
public class SchedulingTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingTasksApplication.class, args);
	}

}
