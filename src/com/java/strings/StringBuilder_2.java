package com.java.strings;

public class StringBuilder_2 {

	public static void main(String[] args) {
		
		String str= "Rupa";
		
		StringBuilder sb = new StringBuilder(str);// Conversion of string to String buffer
		sb.append("eadulakanti");
		System.out.println(sb);
	}

}
