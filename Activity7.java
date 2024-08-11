//Activity 7:
//A train running at the speed of x km/hr crosses a pole in y seconds. Design an algorithm to 
//accept x and y as inputs from the user and then calculate the length of the train.
//Note: values of x and y must be positive and non-zero

package com.questions;

import java.util.Scanner;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Scanner yscanner = new Scanner(System.in);
		System.out.print("Enter the speed of train in km/hr = ");
		float x = scanner.nextInt();
		
		System.out.print("Enter the time taken to cross the pole in seconds = ");
		int y = yscanner.nextInt();
		x = (float)x*5/18;
		
		System.out.println("Lenght of train in m is = "+(x*y)+" metre");
		scanner.close();
		yscanner.close();
	}

}
