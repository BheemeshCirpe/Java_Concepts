package com.java.interview_questions;

public class IQ_A28_Clarifications {

	int i=10;
	int j=12;
	public static void method1()
	{
		System.out.println("Method m1");
	}
	public static void method2()
	{
		System.out.println("Method m2");
	}
	public static void main(String[] args) {
		
		IQ_A28_Clarifications obj1 = new IQ_A28_Clarifications();
		IQ_A28_Clarifications obj2 = new IQ_A28_Clarifications();
		
		test obj3=new test();

		
		System.out.println(obj1.i +" " + obj3.x);
	}

}


class test {
	
	int x=90,y=80;
}