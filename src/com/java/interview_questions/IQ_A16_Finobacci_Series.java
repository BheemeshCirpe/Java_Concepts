package com.java.interview_questions;

import java.util.Scanner;

public class IQ_A16_Finobacci_Series {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");

		int number = sc.nextInt();

		int a = 0, b = 1, c;

		for (int i = 1; i <= number; i++) 
		{

			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}

	}

}
