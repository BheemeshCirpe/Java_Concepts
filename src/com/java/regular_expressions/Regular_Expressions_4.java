package com.java.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions_4 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("[^0-9]");

		Matcher m = p.matcher("r@4ya6r.6a9r0SFJL7AI8S");

		while (m.find())

		{

			System.out.println(m.start() + " " + m.group());

		}

	}

}
