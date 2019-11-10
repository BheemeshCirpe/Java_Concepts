package com.java.interview_questions;

import java.util.Scanner;

public class IQ_A18_Amstrong_Number {

	public static void main(String[] args) {
		int sum = 0, r, temp, c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");

		int number = sc.nextInt();

		temp = number;

		while (number > 0) {

			r = number % 10; // 151
			c = r * r * r;
			sum = sum + c;
			number = number / 10;

		}

		
		if(temp==sum)
		{
			
			System.out.println("number is amstrong");
		}
		else
			System.out.println("number is not amstrong");
	}

}
