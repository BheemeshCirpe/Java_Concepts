package com.java.interview_questions;

import java.util.Scanner;

public class IQ_A22_String_Recurrsion {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any String");
		String s1=sc.nextLine();
		
		System.out.println(IQ_A22_String_Recurrsion.reverse(s1));

	}
	
	public static String reverse(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		
		return reverse(str.substring(1))+  str.charAt(0);
		
	}

}
