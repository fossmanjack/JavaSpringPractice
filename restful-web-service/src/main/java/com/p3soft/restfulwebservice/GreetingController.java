package com.p3soft.restfulwebservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// This marks the class as a controller where every method returns a domain
// object instead of a view.
@RestController
public class GreetingController {

	private static final String template = "Greetings, %s!";
	private final AtomicLong counter = new AtomicLong();

	// Ensures that GET requests to /greeting are mapped here
	@GetMapping("/greeting")
	// RequestParam binds the value of the query string parameter to the local parameter
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "programs") String name) {
		// returns Greeting object with incremeted counter for ID and formatted template string
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}

