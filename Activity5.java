//Activity 5:
//Design an algorithm which accepts 10 integer values, calculates the average and prints it.

package com.questions;

import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr  = new int[10];
		int sum = 0;
		
		for (int index  = 0 ; index<10 ; index++) {
			System.out.print("Enter the "+(index+1)+" element of list = ");
			arr[index] = scanner.nextInt();
			sum += arr[index];
			}
		
		float result = (float)sum/10;
		System.out.println("Average of 10 inputs is = "+result);
		scanner.close();
	}

}
