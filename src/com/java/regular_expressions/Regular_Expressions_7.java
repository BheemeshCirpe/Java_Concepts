package com.java.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions_7 {

	
public static void main(String[] args) {
		
		//Pattern p=Pattern.compile("a?");
		Pattern p=Pattern.compile("a*");
		Matcher m=p.matcher("aberaaahaaka");
		
		while(m.find())
		{
			System.out.println(m.start()+" " +m.group());
		}
		
		
		
	}

}
