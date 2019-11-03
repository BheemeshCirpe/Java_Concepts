package com.java.oops;

public interface Abstraction_IF_4 {
	
	void m1();
	void m2();
	void m3();
	
}

interface U2 extends Abstraction_IF_4{  // interface can extend another interface
	
	void m4();
	void m5();
}

class Y1 implements U2{
	
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){};
	
	public void m5(){};

	
}