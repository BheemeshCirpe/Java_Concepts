package com.java.strings;

public class String_Methods {
	public static void main(String[] args) {
		
		String str1 ="Apple";
		String str2="Banana";
		String str3= "carrot";
		String str4="apple";
		String str5="   This is Roopa Wells Fargo    ";
		String str6= "mango";
		String str7= new String("mango").intern();
		System.out.println(str6==str7);
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str4));
		System.out.println(str1.startsWith("App"));
		System.out.println(str1.startsWith("Apa"));
		System.out.println(str1.endsWith("e"));
		System.out.println(str1.endsWith("z"));
		System.out.println(str1.concat(" Rupa"));
		System.out.println(str3.charAt(2));
		System.out.println(str2.indexOf('n'));
		System.out.println(str2.contains("nana"));
		System.out.println(str5);
		System.out.println(str5.trim());
		System.out.println(str2.replace('a', 'z'));
		
		
	}

}
