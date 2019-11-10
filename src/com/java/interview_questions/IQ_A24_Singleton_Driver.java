package com.java.interview_questions;

public class IQ_A24_Singleton_Driver {

	// Driver Class

	public static void main(String args[]) {
		// instantiating Singleton class with variable x
		IQ_A24_Singleton_Class x = IQ_A24_Singleton_Class.getInstance();

		// instantiating Singleton class with variable y
		IQ_A24_Singleton_Class y = IQ_A24_Singleton_Class.getInstance();

		// instantiating Singleton class with variable z
		IQ_A24_Singleton_Class z = IQ_A24_Singleton_Class.getInstance();

		// changing variable of instance x
		x.s = (x.s).toUpperCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
		System.out.println("\n");

		// changing variable of instance z
		z.s = (z.s).toLowerCase();

		System.out.println("String from x is " + x.s);
		System.out.println("String from y is " + y.s);
		System.out.println("String from z is " + z.s);
	}
}
