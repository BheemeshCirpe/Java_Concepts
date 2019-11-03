package com.java.strings;

public class Split {

	public static void main(String[] args) {

		String str1 = "Lear@ning@selenium@java@core";

		String a[] = str1.split("@", 6);
		for(String b:a)
			System.out.println(b);
		
	}

}
