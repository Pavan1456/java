package com.questions;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string to find unique elements = ");
		String str = scanner.nextLine();
		String uniq = "";
		for (int index = 0 ; index < str.length() ; index++) {
			char charc = str.charAt(index);
			String join = Character.toString(charc);
			
			if (uniq.contains(join) == false) {
				uniq = uniq+join;
			}
			
		}
		
		System.out.println("Unique element of entered string is = "+uniq);
		scanner.close();
	}

}
