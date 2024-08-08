/*Activity 1: 
Design an algorithm to accept 25 integer elements for an array then find the maximum number 
in the set and display it. */

package com.questions;

import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[25];
		
		
		System.out.println("enter the 25 integer elements of array:");
		
		for (int index=0 ; index < 25 ; index++) {
			arr[index] = scanner.nextInt();
		}
		System.out.println(arr);
		
		int maximum = arr[0];
		for(int i = 0 ; i < 25;i++) {
			if (arr[i] > maximum ) {
				maximum = arr[i];
			}
			
		}
		System.out.println("The maximum number in the list is ="+maximum);
		scanner.close();
		
		}

}
