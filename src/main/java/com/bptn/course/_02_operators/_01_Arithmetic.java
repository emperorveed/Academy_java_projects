package com.bptn.course._02_operators;

public class _01_Arithmetic {

	public static void main(String[] args) {

		/*
		 * We must use meaningful variable names. Single letter variable names 
		 * are often discourage.
		 */
		
		int temp = 8; // Hello
		
		var a = 8;
		
		int b = 3;
		
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		
		
		double div = (double)a / b; // cast
		
		System.out.println("Sum: " + sum );
		System.out.println("Sub: " + sub );
		System.out.println("Multiplication: " + mul );
		System.out.println("Division: " + div );
		

		
	}

}
