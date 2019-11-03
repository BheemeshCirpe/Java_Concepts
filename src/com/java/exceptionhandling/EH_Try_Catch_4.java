package com.java.exceptionhandling;

public class EH_Try_Catch_4 {

	public static void main(String[] args) {
		
		try{
			
			System.out.println(10/0);
		}
		
		//System.out.println("Test");  //There should not be any statement between Try catch
		catch (Exception e) {
			System.out.println("Exception Handled");
		}

		
		
		
	}

}
