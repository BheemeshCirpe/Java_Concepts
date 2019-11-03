package com.java.interview_questions;

public class Legato_Question_1 {

	static int i = 1;

	static void m1() {

		System.out.println(i++);

	}

	static void m2() {

		System.out.println(i + 1);
	}

	public static void main(String[] args) {

		Legato_Question_1.m1();
		Legato_Question_1.m2();

	}

}
