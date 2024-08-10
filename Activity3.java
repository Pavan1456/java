//Activity 3: 
//Design an algorithm to print a pyramid based on level entered by the user. 
//Sample output is shown below. 
//Enter the level of pyramid: 10
//The pyramid is -
// 1
// 232
// 45654
// 7890987
// 123454321
// 67890109876
// 2345678765432
// 901234565432109
// 78901234543210987
//6789012345432109876
package com.questions;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// i have done this task by creating an array of numbers in string data type
		String[] arr = {"1","2","3","4","5","6","7","8","9","0"};
		
		Scanner scanner  = new Scanner(System.in);
		System.out.print("Enter the Stage of pyramid = ");
		
		int obj1 = scanner.nextInt(); //for taking level as input from user
		int one = 0;
		int space = 1;
		String joint = "";
		
		
//for each level
		for (int i=0 ; i<obj1 ; i++) {
//for number of spaces
			int n_space = obj1-i;
			for (int count=0 ; count < n_space ; count++) {
				System.out.print(" ");
			}
			
			
// for printing the number in increasing sequence
			for(int index=0 ; index < space ; index++ ) {
				if(one==10) {
					one=0;
				}
				joint = arr[one]+joint;
				System.out.print(arr[one]);
				one+=1;


			}
// for printing the number in decreasing order
			
			String modified = joint.substring(1);
			System.out.print(modified);
			
			joint="";
			System.out.println("");
			
			space+=1;
		
//closing scanner due to leakage of information
		scanner.close();

	}

}
	}
