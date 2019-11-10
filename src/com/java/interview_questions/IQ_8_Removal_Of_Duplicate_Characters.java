package com.java.interview_questions;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class IQ_8_Removal_Of_Duplicate_Characters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		String str = sc.nextLine();

		StringBuilder sb = new StringBuilder();

		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();

		for(int i=0;i<str.length()-1;i++)
			
		{
			 lh.add(str.charAt(i));
		}
		
		for(char c:lh)
		{
			sb.append(c);
		}
		
		System.out.println(sb);
		
	}
	


}
