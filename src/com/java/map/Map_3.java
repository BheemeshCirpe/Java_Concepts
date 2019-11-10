package com.java.map;

import java.util.LinkedHashMap;

public class Map_3 {

	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1,"Hyd");
		lhm.put(2, "cbe");
		lhm.put(3,"kerala");
		
		System.out.println(lhm.get(2));
		
		
		
		  System.out.println(lhm.containsValue("Hyd"));
		  System.out.println(lhm.containsValue("Hy"));
		  System.out.println(lhm.containsKey(1));
		  System.out.println(lhm.containsKey(5));
		 
	}

}
