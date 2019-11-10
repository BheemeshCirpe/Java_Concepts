package com.java.interview_questions;

public class IQ_6_Legato_Question_1 {

	static int i = 1;

	static void m1() {

		System.out.println(i++);

	}

	static void m2() {

		System.out.println(i + 1);
	}

	public static void main(String[] args) {

		IQ_6_Legato_Question_1.m1();
		IQ_6_Legato_Question_1.m2();

	}

}
