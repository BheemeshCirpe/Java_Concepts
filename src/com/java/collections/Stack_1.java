package com.java.collections;

import java.util.Stack;

public class Stack_1 {

	public static void main(String[] args) {
		Stack<String> sta = new Stack<String>();

		sta.push("Cognizant");
		sta.push("Oracle");
		sta.push("Facebook");

		System.out.println(sta);
		sta.pop();

		System.out.println(sta);

		sta.pop();

		System.out.println(sta);

	}

}
