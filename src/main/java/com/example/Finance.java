package com.example;

import org.springframework.stereotype.Component;

@Component
public class Finance {

	public float tax(int salary) {
		float result = salary * 20 / 100;
		return result;
	}
}
