package com.java.exceptionhandling;

import java.util.Scanner;

public class EH_Throw_1 {

	static void status(int age) throws InvalidageException {

		if (age >= 18) {
			System.out.println("Eligible for vote");
		}

		else {

			throw new InvalidageException();
		}
	}

	public static void main(String[] args) throws InvalidageException {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = s.nextInt();

		EH_Throw_1.status(age);

	}

}

class InvalidageException extends Exception {  // code for user defined exception and it should extend Exception class

	InvalidageException() {

		System.out.println("Testing");
	}

}
