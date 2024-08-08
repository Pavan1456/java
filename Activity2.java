//Activity 2:
//Design an algorithm to accept 10 integer elements for an array and then find the number of 
//times the number with the maximum value occurs in the array. 
//For Example –
//If input elements are: 1, 2, 5, 6, 8, 9, 9, 3, 4, and 2
//Output must be 2
//Reason: The number with the highest value in the array is 9. It occurs 2 times in the array. 

package com.questions;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[25];
		
		for (int index=0 ; index<10 ; index++) {
			
			System.out.print("enter the "+(index+1)+" element in the list:");
			arr[index] = scanner.nextInt();
			
		}
		
		int maximum = arr[0];
		
		for (int i=0 ; i<10 ; i++) {
			if (arr[i] > maximum) {
				maximum = arr[i];
				
			}
			
		}
		int count = 0 ;
		
		for (int i=0 ; i<10 ; i++) {
			if(arr[0] == maximum) {
				count+=1;
			}
		}
		if(count == 0) {
			count = 1;
		}
		System.out.println("The maximum number is : "+maximum+" And its count is : "+count);
		scanner.close();
	}

}
