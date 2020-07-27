package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@RequestMapping(value="/math/{operation}/{a}/{b}", method=RequestMethod.GET)
	public String calculation(
			@PathVariable(value="operation") String operation,
			@PathVariable(value="a") int num1, 
			@PathVariable(value="b") int num2) {
		Maths ref = new Maths();
		int result = 0;

		if (operation.equals("add") || operation.equals("addition")) {
			result = ref.add(num1, num2);
		} else if (operation.equals("sub") || operation.equals("subtraction")) {
			result = ref.subtract(num1, num2);
		} else if (operation.equals("multiply")  || operation.equals("multiplication")) {
			result = ref.multiply(num1, num2);
		} else if (operation.equals("divide") || operation.equals("division")) {
			result = ref.divide(num1, num2);
		} else {
			return "Invalid operation";
		}
		return "The answer is " + result;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "Welcome to the Home page";
	}

	@RequestMapping(value="/london", method=RequestMethod.GET)
	public String london() {
		return "Welcome to London";
	}
	
	@RequestMapping(value="/london", method=RequestMethod.POST)
	public String london2() {
		return "Welcome to London POST";
	}
	
	@RequestMapping(value="/london", method=RequestMethod.DELETE)
	public String london3() {
		return "Welcome to London DELETE";
	}
	
	@RequestMapping(value="/manchester")
	public String manchester() {
		return "Welcome to Manchester";
	}
	
	@RequestMapping(value="/party-time")
	public String partyTime() {
		return "Party time";
	}
	
	@RequestMapping(value="/json-payload")
	public String json() {
		return "{name:bob, age:22}";
	}
	
	// Sending a reply based on the parameter
	// GET method means the param(data) is visible in query string
	// Use POST to hide data in the request body
	@RequestMapping(value="/msg/{name}", method=RequestMethod.GET)
	public String reply(@PathVariable(value="name") String name) {
		return "Hello " + name;
	}
	
	@RequestMapping(value="/info/{name}/{location}", method=RequestMethod.GET)
	public String info(@PathVariable(value="name") String name,
			@PathVariable(value="location") String location) {
		return "Name: " + name + ", Location: " + location;
	}
	
	@RequestMapping(value="/info/", method=RequestMethod.POST)
	public String infoPost(@RequestBody Object info) {
		return info.toString();
	}
}
