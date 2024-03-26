package com.p3soft.restfulwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This annotation is a convenience annotation that adds the following:
// - @Configuration -- a source of bean definitions for application context
// - @EnableAutoConfiguration -- start adding beans based on classpath settings
// - @ComponentScan - look for other components, configurations, and services in the com/p3soft path
@SpringBootApplication
public class RestfulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServiceApplication.class, args);
	}

}
