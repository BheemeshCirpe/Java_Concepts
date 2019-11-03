package com.java.oops;

public class Inheritance_2 {
	
	public void m1()
	{
		System.out.println("this is method m1 from parent");
	}

	public static void main(String[] args) {
		
	
		Grand_Child_1 g1= new Grand_Child_1();
		g1.m1();
		g1.m2();
		g1.m3();
	}

}

class Child_2 extends Inheritance_2
{
	public void m2()
	{
		System.out.println("this is method m2 from child");
	}
	
}

class Grand_Child_1 extends Child_2
{
	public void m3()
	{
		System.out.println("this is method m3 from grandchild");
	}
	
}