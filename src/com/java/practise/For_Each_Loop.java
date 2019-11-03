package com.java.practise;

public class For_Each_Loop {

	public static void main(String[] args) {
		
		
		int a[]= {1,4,8,15,2};
		
		for(int i=0;i<a.length;i=i+2)
			System.out.println(a[i]);
		
		System.out.println("*******************");
		
		for(int x:a)
			System.out.println(x);
		
	}

}
