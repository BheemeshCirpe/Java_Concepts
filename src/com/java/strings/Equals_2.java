package com.java.strings;

public class Equals_2 {

	public static void main(String[] args) {
		
		
		String str1="Rupa";
		String str2="Rupa";
		String str3="Shipla";
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		
		StringBuffer str4=new StringBuffer("Rupa");
		StringBuffer str5=new StringBuffer("Rupa");
		StringBuffer str6=new StringBuffer("Shilpa");
		
		System.out.println(str4==str5);
		System.out.println(str4==str6);
		
		

	}

}
