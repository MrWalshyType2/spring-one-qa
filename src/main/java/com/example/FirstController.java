package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

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
}
