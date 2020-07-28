package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/finance") // all mappings in here start with /finance implicitly
public class FinanceController {

	@Autowired
	Finance finance;
	
	@GetMapping(value="/tax/{salary}")
	public String calculateTax(@PathVariable(value="salary") int salary) {
		float tax = finance.tax(salary);
		return "Your tax on salary: " + salary + " is: " + tax;
	}
}
