package com.java.enums;

public enum Enum_3 {
	
	
	Jan(15), Feb, Mar, Apr, May, Jun, Jul(30), Aug, Sep, Oct, Nov, Dec;
	
	int id;
	
	Enum_3()
	{
		this.id=100;
	}
	
	Enum_3(int id)
	{
		this.id=id;	
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(Enum_3.Jan.id);
		System.out.println(Enum_3.Feb.id);
		System.out.println(Enum_3.Jul.id);
	}

}

