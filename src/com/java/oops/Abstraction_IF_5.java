package com.java.oops;

public interface Abstraction_IF_5 {

	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	
	public static void main(String[] args) {
		
		Impclasse obj =new 	Impclasse();
		obj.m1();
	}
	
}

class ImpClass implements Abstraction_IF_5{  //this is adapter class that implements all the interface methods  with empty implementation
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
}

class Impclasse extends ImpClass{
	 
	 public void m1(){System.out.println("m1 Method implementation");}
}

class Impclass_2 extends ImpClass{
	
	public void m2()
	{
		System.out.println("m2 method implementation");
	}
}