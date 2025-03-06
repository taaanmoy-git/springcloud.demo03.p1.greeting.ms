package springcloudms.demo03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@GetMapping(value="/greeting")
	public String getMessage() {
		return "Welcome to Spring Cloud MS Greeting";
	}
}
