package com.java.interview_questions;

public class IQ_A13_Reverse_Triangle {

	public static void main(String[] args) {


		int i,j,k;
		for (i=4;i>=1;i--)
		{
			for(k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
