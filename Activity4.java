//Activity 4: 
//Design an algorithm to calculate the factorial of a number N. The value of N is provided as an 
//input by the user. 

package com.questions;

import java.util.Scanner;



public class Activity4 {

	
	public static int factorial(int number) {
		int num = 1;
		for (int index = number ; index >= 1 ; index--) {
			num*=index;
		}
		return num;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number to get factorial = ");
		int input1 = scanner.nextInt();
		
		if (input1 == 0) {
			System.out.println("Factorial of 0 is = 1");
		}
		
		else if (input1 < 0) {
			System.out.println("Invalid input, re run the program and give postive integer");
		}
		
		else {
			
			System.out.println("Factorial of number "+input1+" is = " + factorial(input1));
			
		}
		scanner.close();
	}

}
