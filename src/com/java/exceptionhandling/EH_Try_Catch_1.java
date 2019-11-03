package com.java.exceptionhandling;

public class EH_Try_Catch_1 {

	public static void main(String[] args) {
		
		
		try{
			
			System.out.println(10/0);//unchecked exception
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
		
		System.out.println("Rest of the Code..");
		}
		
		

	}


