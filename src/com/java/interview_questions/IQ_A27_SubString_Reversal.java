package com.java.interview_questions;

public class IQ_A27_SubString_Reversal {

	public static void main(String[] args) {

		String s1 = "This is my Computer";

		char c[] = s1.toCharArray();
		char temp;
		int count = 0;

		// String s2 = "This si ym computer";

		for (int i = 0; i < c.length; i++) {
			if (count == 2)
				break;

			else if (c[i] == ' ') {
				count++;
				temp = c[i + 2];
				c[i + 2] = c[i + 1];
				c[i + 1] = temp;
			}

		}

		System.out.println(c);

	}

}
