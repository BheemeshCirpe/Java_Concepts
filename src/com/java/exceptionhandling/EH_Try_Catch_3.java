package com.java.exceptionhandling;

public class EH_Try_Catch_3 {

	public static void main(String[] args) {

		
	try{
			
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
		finally{
		
			System.out.println("Finally with Exception");
		}
		
		//////////////////////////////////////////////
		
		try{
			System.out.println("No Exeception");
			
		}
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
		
		finally{
			
			System.out.println("Finally without Exception");
		}
		
		

	}

}
