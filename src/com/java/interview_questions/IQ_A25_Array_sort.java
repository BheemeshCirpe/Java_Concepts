package com.java.interview_questions;

import java.util.TreeSet;

public class IQ_A25_Array_sort {

	public static void main(String[] args) {

		int Arr[] = { 1, 55, 23, 78, 10 };

		TreeSet<Integer> t = new TreeSet<Integer>();

		for (int a : Arr) {
			t.add(a);
		}

		System.out.println(t);

	}

}
