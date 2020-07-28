package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/maths")
public class MathsController {
	
	@Autowired
	Maths ref;
	
	@GetMapping(value="/math/{operation}/{a}/{b}")
	public String calculation(
			@PathVariable(value="operation") String operation,
			@PathVariable(value="a") int num1, 
			@PathVariable(value="b") int num2) {

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
		return "The answer is: " + result;
	}
}
