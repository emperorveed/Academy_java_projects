package com.bptn.projects.bptn_projects._week_01;
import java.util.InputMismatchException;
import java.util.Scanner;
public class _02_CodeChallenge {

	public static String palindrome(){
	      Scanner pscanner = new Scanner(System.in);
	      System.out.println("Enter a string:");
	      String value = pscanner.nextLine();
	      // create a stringBuilder Object
	      StringBuilder palindromeSb = new StringBuilder(value);
	      // reverse the value and convert to string
	      String revValue = palindromeSb.reverse().toString();
	      if(value.equals(revValue)){
	       return revValue + " is a palindrome";
	      }else{
	        return revValue + " is not a palindrome";
	      }
	    }
	    public static String reverseString(){
	        Scanner revScanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String value = revScanner.nextLine();
	        StringBuilder reverseSb = new StringBuilder(value);
	        String reversed = reverseSb.reverse().toString();
	        System.out.println(reversed);
	        return reversed + " is the string reversed";
	      }

	    public static String concat(){
	      Scanner concatScanner = new Scanner(System.in);
	      System.out.println("Enter First string: ");
	      String text1 = concatScanner.nextLine();
	      System.out.println("Enter Second string: ");
	      String text2 = concatScanner.nextLine();
	      return text1 + text2;
	    }
	    public static String compare(){
	      Scanner compareScanner = new Scanner(System.in);
	      System.out.println("Enter the first string: ");
	      String text1 = compareScanner.nextLine();
	      System.out.println("Enter the sceond string: ");
	      String text2 = compareScanner.nextLine();
	      if(text1.equals(text2)){
	        return "The entered strings are equal";
	      }else{
	        return "The entered strings are not equal";
	      }
	    }

	    public static String stringLength(){
	      Scanner lengthScanner = new Scanner(System.in);
	      System.out.println("Enter a string: ");
	      String text = lengthScanner.nextLine();
	      return "The length of the entered string is: " + text.length();
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
		        int continueMenu = 1;
		        int choice = 0;
		        // Display String Menu
		        do {
		        System.out.println("/...String Menu.../");
		        System.out.println("Press 1 for Palindrome Check");
		        System.out.println("Press 2 to reverse a String");
		        System.out.println("Press 3 to Concatenate two Strings");
		        System.out.println("Press 4 for String Comparison");
		        System.out.println("Press 5 to Calculate the Length of String");

		        // Take user input for operation choice
		        System.out.print("Enter your choice: ");
		        try { 
		        	choice = scanner.nextInt();
		        }
		        catch(InputMismatchException e) {
		        	System.out.println("Error: " + e);
		        };

	          // Clean up left behind newline character left by nextInt();
	          scanner.nextLine();
	          
	          if(choice ==1){
	            //palendrome check
	           String result = palindrome();
	            System.out.println(result);
	          }else if(choice ==2){
	            String result = reverseString();
	             System.out.println(result);
	            //reverse string
	          }else if(choice ==3){
	              String result = concat();
	             System.out.println(result);

	            //concat string
	          }else if(choice ==4){
	            String result = compare();
	             System.out.println(result);
	            //comparison string
	          }else if(choice  ==5){
	            String result = stringLength();
	             System.out.println(result);
	            //length string
	          }else{
	             
	               System.out.println("Invalid choice! Please make a valid choice.") ;
	          }

	        System.out.println("To continue calculation press 1, else press any other number to exit: ");
	        continueMenu = scanner.nextInt();
	        scanner.nextLine();

	    }
	      while(continueMenu== 1 );
	      scanner.close();
	    }

}
