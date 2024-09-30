package com.bptn.projects.bptn_projects._week_01;

import java.util.Scanner;

public class CodeChallenge {
	
	
	
	public static double  addition(double num1, double num2) {
        return num1 + num2;
    }
	public static double  subtraction(double num1, double num2) {
		return num1 - num2;
	}
	public static double  multiplication(double num1, double num2) {
		return num1 * num2;
	}
	public static double  division(double num1, double num2) {
		return num1 / num2;
	}
	public static double  square(double num1) {
		return num1 * num1;
	}
	public static double  sqrt(double num1) {
		return Math.sqrt(num1);
	}
	public static double  reciprocal(double num1) {
		return 1 / num1;
	}
	

	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        int continueCalc = 1;

	        // Display Calculator Menu
	        do {
	        System.out.println("/...Calculator Menu.../");
	        System.out.println("Press 1 for addition");
	        System.out.println("Press 2 for subtraction");
	        System.out.println("Press 3 for multiplication");
	        System.out.println("Press 4 for division");
	        System.out.println("Press 5 to square a number");
	        System.out.println("Press 6 to find a square root");
	        System.out.println("Press 7 to find the reciprocal");

	        // Take user input for operation choice
	        System.out.print("Enter your choice: ");
	        int choice = scanner.nextInt();

	        // Variables to store numbers
	        	double num1, num2, result, remainder;
	       
	          

	        // Using if-else to handle operations
	        if (choice == 1) { // Addition
	            System.out.print("Enter the first number: ");
	            num1 = scanner.nextDouble();
	            System.out.print("Enter the second number: ");
	            num2 = scanner.nextDouble();
	            result = addition(num1, num2);
	            System.out.println("The sum of the numbers is: " + result);
	        } 
	        
	        else if (choice == 2) { // Subtraction
	            System.out.print("Enter the first number: ");
	            num1 = scanner.nextDouble();
	            System.out.print("Enter the second number: ");
	            num2 = scanner.nextDouble();
	            result = subtraction(num1, num2);
	            System.out.println("The difference of the numbers is: " + result);
	        } else if (choice == 3) { // Multiplication
	            System.out.print("Enter the first number: ");
	            num1 = scanner.nextDouble();
	            System.out.print("Enter the second number: ");
	            num2 = scanner.nextDouble();
	            result = multiplication(num1, num2);
	            System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + result);
	        } else if (choice == 4) { // Division
	            System.out.print("Enter the first number: ");
	            num1 = scanner.nextDouble();
	            System.out.print("Enter the second number: ");
	            num2 = scanner.nextDouble();
	            if (num2 != 0) {
	                result = division(num1, num2);
	                remainder = num1 % num2;
	                System.out.println("Dividing " + num1 + " by " + num2 + " the quotient is " + result);
	                System.out.println("The remainder is " + remainder);
	                
	            } else {
	                System.out.println("Error: Division by zero is not allowed.");
	            }
	        } else if (choice == 5) { // Square
	            System.out.print("Enter the number to be squared: ");
	            num1 = scanner.nextDouble();
	            result = square(num1);
	            System.out.println("The square of the number " + num1 + " is " + result);
	        } else if (choice == 6) { // Square Root
	            System.out.print("Enter the number to find the square root of: ");
	            num1 = scanner.nextDouble();
	            if (num1 >= 0) {
	                result = sqrt(num1);
	                System.out.println("The square root of the number " + num1 + " is " + result);
	            } else {
	                System.out.println("Error: Cannot find the square root of a negative number.");
	            }
	        } else if (choice == 7) { // Reciprocal
	            System.out.print("Enter the number to find the reciprocal of: ");
	            num1 = scanner.nextDouble();
	            if (num1 != 0) {
	                result = reciprocal(num1);
	                System.out.println("The reciprocal of the number " + num1 + " is = " + result);
	            } else {
	                System.out.println("Error: Reciprocal of zero is undefined.");
	            }
	        } else { // Invalid Choice
	            System.out.println("Invalid choice! Please make a valid choice.");
	        }
	        
	        // Ask the user if they want to continue
            System.out.print("To continue calculation press 1, else press any other number to exit: ");
            continueCalc = scanner.nextInt(); // Read user input to continue or exit
	        
	        }while (continueCalc == 1);

	        scanner.close();

	        
	    }

}
