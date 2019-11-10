package com.java.interview_questions;

public class IQ_A12_Triangle {

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
				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
