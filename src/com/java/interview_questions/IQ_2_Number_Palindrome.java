package com.java.interview_questions;

import java.util.Scanner;

public class IQ_2_Number_Palindrome {

	public static void main(String[] args) {

		int number;
		int sum = 0, r = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		number = sc.nextInt();
		temp=number;
		while(number >0) //  141
		{
			
		r=number%10;   //1,4,1
		sum=(sum*10)+r; // 1,14,, 141
		number=number/10; // 14, 1,0
		
		}
			
		
		if(temp==sum)
		{
			System.out.println("number is palindrome");
		}
		
		else
			System.out.println("number is not palindrome");

	}

}
