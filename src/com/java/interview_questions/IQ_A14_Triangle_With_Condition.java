package com.java.interview_questions;

public class IQ_A14_Triangle_With_Condition {

	public static void main(String[] args) {

		int i, j;

		for (i = 1; i <= 4; i++) 
		{

			for (int k = 4; k >= i; k--) 
			{
				System.out.print(" ");
			}
			
			for (j = 1; j <= i; j++) 
			{
				if(i%2==0)
				System.out.print("$ ");
				else
				System.out.print("* ");
			}

			System.out.println();
		}


	}

}
