package com.questions;

import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int obj2 = scanner.nextInt();
		boolean prime = false;
		if(prime == false) {
		for (int index=2; index<obj2 ; index++) {
			if(obj2 == 1) {
				System.out.println("Neither prime nor composite");
				prime = true;
			}
			else if(obj2 == 2) {
				System.out.println("It is a prime");
				prime = true;
			}
			else if(obj2%index==0) {
				System.out.println("number is not prime");
				 prime = true;
				break;
			
			}
			
		}}
		if(prime == false) {
		System.out.println("It is a prime");
		}
		scanner.close();
	}

}
