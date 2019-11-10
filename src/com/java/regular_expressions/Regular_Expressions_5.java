package com.java.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions_5 {

	public static void main(String[] args) {


		//Pattern p=Pattern.compile("[0-9]");
		Pattern p = Pattern.compile("\\d");// for numbers d, not numbers then D
		Matcher m=p.matcher("j56f3sjlfd");
		
		while(m.find())
		{
			System.out.println(m.start()+"   -->"+m.group());
		}
	}

}
