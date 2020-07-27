package com.example;

public class Maths {
	// logic
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		if (a != 0 && b != 0) {
			return a / b;
		}
		return 0;
	}
}
