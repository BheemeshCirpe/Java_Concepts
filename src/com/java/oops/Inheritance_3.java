package com.java.oops;

public class Inheritance_3 {

	public void m1()
	{
		System.out.println("this is method m1 from parent");
	}
	public static void main(String[] args) {
		
		Child_3 c3= new Child_3();
		Child_4 c4 =new Child_4();
		
		c3.m1();
		c3.m2();
		
		c4.m1();
		c4.m3();
		
				
		
	}

}


class Child_3 extends Inheritance_3
{
	public void m2()
	{
		System.out.println("this is method m2 from child 1");
	}
}

class Child_4 extends Inheritance_3{
	
	public void m3()
	{
		System.out.println("this is method m3 from child 2");
	}
	
}