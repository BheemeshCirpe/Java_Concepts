package com.java.interview_questions;

import java.util.Scanner;

public class IQ_A17_Prime_Numbers {

	public static void main(String[] args) {
    
		
		boolean flag= false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number = sc.nextInt();
		
		for(int i =2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				flag=true;
				break;
			}
		}
		
		
		if (flag)
			System.out.println(number + " is not a prime number.");
		else
			System.out.println(number + " is a prime number.");
		

	}

}
