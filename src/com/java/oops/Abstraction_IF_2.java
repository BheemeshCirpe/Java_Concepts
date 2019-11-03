package com.java.oops;

public interface Abstraction_IF_2 {
	
	void m1(); // public and abstract  ==>public abstract void m1(); (internally converted by compiler)
	void m2();
	void m3();
	int a=10; // public static final   ==> public static final int a=10; (internally converted by compiler)

}

class Imp_1 implements Abstraction_IF_2
{

	//default  void m1(){}   		//default void m1() reducing permission will give compile time error
	
	public void m1()
	{
		
	}
	
	public void m2()
	{
		
	}
	
	public void m3()
	{
		
	
	}
}