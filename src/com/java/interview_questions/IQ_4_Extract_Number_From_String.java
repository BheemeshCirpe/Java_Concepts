package com.java.interview_questions;

import java.util.Scanner;

public class IQ_4_Extract_Number_From_String {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String");
		String str=sc.nextLine();
		String number;
		
		number=str.replaceAll("[^0-9]","");
		System.out.println(number);
	}

}
