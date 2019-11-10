package com.java.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions_2 {

	public static void main(String[] args) {
		
		
		Pattern p=Pattern.compile("Rupa");
		Matcher m=p.matcher("Rupa is from CTS and Rupa is form NMREC");
		
		while(m.find())
		{
			//System.out.println(m.start()+" "+m.group());
			System.out.println(m.start()+" "+m.group()+" "+m.end());
		}

	}

}
