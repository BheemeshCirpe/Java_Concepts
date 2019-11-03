package com.java.oops;

public abstract class Abstraction_AC2 {

	abstract void m1();

	abstract void m2();

	void m3() {

	}
}

abstract class v1 extends Abstraction_AC2 {

	void m1() {
	}
}

class v2 extends v1 {   //this is Concrete Class Which implements all of it's methods from Abstract Class

	void m2() 
	{

	}
}