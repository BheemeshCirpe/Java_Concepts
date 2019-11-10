package com.java.interview_questions;

import java.util.Scanner;

public class IQ_5_Extracting_Numbers_From_String_Add {

	public static void main(String[] args) {
		String str;
		String number;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		str = sc.nextLine();
		number = str.replaceAll("[^0-9]", "");
	
		System.out.println(number);

		int x = Integer.parseInt(number);

		int sum = 0;

		while (x > 0)

		{
			sum = sum + x % 10; 
			x = x / 10;
		}

		System.out.println(sum);

	}

}
