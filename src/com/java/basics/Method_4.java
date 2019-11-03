package com.java.basics;

public class Method_4 {
	
	int a=40,b=41;
	public void m1(int x, int y)
	{
		int a,b;
		
		System.out.println(x);
		System.out.println(y);
		
	}
	
	public  void m2()
	{
		
		
	}
	
	public  void m3()
	{
		Method_4 m4=new Method_4();
		m4.m1(this.a,this.b);
		this.a=80;
		this.b=81;
		
		Method_4 m6=new Method_4();
		m4.m1(this.a,this.b);
		
	}

	public static void main(String[] args) {
	
		Method_4 m5=new Method_4();
		
		m5.m3();
	
	}

}
