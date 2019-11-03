package com.java.oops;

public interface Abstraction_IF_3 {
	
	void m1();
	

}

interface Interface_2{
	void m1();	
	void m2();
}

interface Interface_3{
	
	void m3();
	
}

class Implementation_class implements Abstraction_IF_3,Interface_2,Interface_3  //multiple inheritance possible in interface
{
	
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
