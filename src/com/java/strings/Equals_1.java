package com.java.strings;

public class Equals_1 {

	public static void main(String[] args) {
		
		String str1="Rupa";
		String str2="Rupa";
		String str3="Shipla";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));// over rides equals method in object class and returns true/false by comparing string values
		
		StringBuffer str4=new StringBuffer("Rupa");
		StringBuffer str5=new StringBuffer("Rupa");
		StringBuffer str6=new StringBuffer("Shilpa");//equals method is not overrided in string buffer, hence retunrs the value comparing object address 
		
		System.out.println(str4.equals(str5));
		System.out.println(str4.equals(str6));
	
		
	
	}

}
