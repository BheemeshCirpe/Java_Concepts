package com.java.interview_questions;

public class IQ_A21_Missing_Number {

	public static void main(String[] args) {
	
		int a[] = { 1, 2, 3, 5 };

		int sum1 = 0;

		for (int i = 0; i < a.length; i++)
			sum1 = sum1 + a[i];

		int sum2 = 0;

		for (int j = 1; j <= a.length + 1; j++)
			sum2 = sum2 + j;

		
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println("Missing Number is " + (sum2 - sum1));
		
		
		
		
	}

}
