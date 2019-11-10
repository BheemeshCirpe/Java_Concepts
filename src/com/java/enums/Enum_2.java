package com.java.enums;

public enum Enum_2 {

	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
	
	public static void main(String[] args) {
		
		Enum_2 today = Enum_2.Wednesday;
		Enum_2 holiday = Enum_2.Sunday;
		
		System.out.println("Today = " + today);
		System.out.println(holiday + " is holiday");
		
	}
	
	
}

