package com.java.regular_expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions_9 {
	
	public static void main(String[] args) {
		
		String Emailid;
		Scanner sc = new Scanner(System.in);
		Pattern p = Pattern.compile("[a-zA-Z0-9[.]]+@(gmail|yahoo)[.]com");
		
		
		System.out.println("Enter Email ID");
		Emailid=sc.nextLine();

		Matcher m = p.matcher(Emailid);

		if(m.find()&&m.group().equals(Emailid))

		System.out.println("Valid Email ID    :"+m.group());

		else System.out.println("Invalid Email ID");

	}
		
	}
	
	
