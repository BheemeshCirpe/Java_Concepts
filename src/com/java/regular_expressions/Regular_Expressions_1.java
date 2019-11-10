package com.java.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions_1 {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("a"); //reg expression
		Matcher m=p.matcher("aaberaha");// target string
		
		while(m.find())
		{
			System.out.println(m.start()+" " +m.group());
		}
		
	}

}
