package com.java.regular_expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions_8 {

	public static void main(String[] args) {
		String num;
		Scanner sc = new Scanner(System.in);
		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");

		System.out.println("Enter Number");
		num = sc.nextLine();
		
		
		Matcher m = p.matcher(num);

		if (m.find() && m.group().equals(num)) {
			System.out.println("Valid Mobile Number");
			System.out.println(m.group());
		}

		else
			System.out.println("Invalid Mobile Number");

	}

	}


