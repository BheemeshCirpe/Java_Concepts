package com.java.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions_3 {

	public static void main(String[] args) {
		
	Pattern p=	Pattern.compile("[abc]");	
	//Pattern p=	Pattern.compile("[^abc]");
	Matcher m=p.matcher("aldbakdc");
	
	while(m.find())
	{
		System.out.println(m.start()+" "+m.group());
	}

	}

}
