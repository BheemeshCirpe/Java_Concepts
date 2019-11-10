package com.java.interview_questions;

import java.util.Arrays;
import java.util.Scanner;

public class IQ_A20_Anagram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter string 1");
		String str1 = sc.nextLine();

		System.out.println("enter string 2");
		String str2 = sc.nextLine();

		String s1 = str1.replaceAll("\\s", "");
		String s2 = str1.replaceAll("\\s", "");

		boolean flag = true;
		if (s1.length() != s2.length()) {
			flag = false;
		}
		else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);	
			flag=Arrays.equals(ArrayS1, ArrayS2);
		}
		
		if (flag) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
		
	}

}
