package com.questions;

import java.util.Scanner;

public class Pallindrome {
	
	public static void pallindrome(int n) {
		int end = 1;
		int reverse = 0;
		while (end >0){
			end = n%10;
			n = n/10;
			reverse = (reverse*10)+end;
		}
		if (reverse == n) {
			System.out.println("This number is pallindrome");
//			return (n);
		}
		else {
			System.out.println("Ths number is not pallindrome");
//			return ();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the number to find number is pallindrome or not = ");
		Scanner scanner = new Scanner(System.in);
		int obj1 = scanner.nextInt();
		pallindrome(obj1);
		scanner.close();
		
	}

}



//String strnum = String.valueOf(number);
//StringBuffer sb = new StringBuffer(strnum);
//sb = sb.reverse();
//String strenv = sb.toString();
//int numrev = Integer.parseInt(strenv);
//System.out.println(numrev);