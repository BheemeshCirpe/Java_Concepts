package com.java.oops;

public class Polymorphism_2_C_Overloading_1 {

	public Polymorphism_2_C_Overloading_1() {
		System.out.println("this is 0- arg constructor");
	}

	public Polymorphism_2_C_Overloading_1(int a)

	{
		System.out.println("this is 1- arg constructor");

	}
	public Polymorphism_2_C_Overloading_1(int a,int b)

	{
		System.out.println("this is 2- arg constructor");

	}

	
	public Polymorphism_2_C_Overloading_1(char c)

	{
		System.out.println("this is 1- arg constructor with different data type");

	}
	public static void main(String[] args) {

		Polymorphism_2_C_Overloading_1 c1 = new Polymorphism_2_C_Overloading_1();
		Polymorphism_2_C_Overloading_1 c2 = new Polymorphism_2_C_Overloading_1(5);
		Polymorphism_2_C_Overloading_1 c3 = new Polymorphism_2_C_Overloading_1(6,10);
		Polymorphism_2_C_Overloading_1 c4 = new Polymorphism_2_C_Overloading_1('r');
	}

}
