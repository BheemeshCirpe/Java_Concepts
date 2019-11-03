package com.java.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map_1 {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put(1, 'r');
		hm.put(2, 'u');
		hm.put(3, 'p');
		hm.put(1, 'a');
		hm.put(1, 'b');
		
		System.out.println(hm);
		
		HashMap hm2= new HashMap();
		hm2.put("Telangana", "Hyderabad");
		hm2.put("Karntaka", "Warngal");
		System.out.println(hm2);
	
		
		LinkedHashMap hm3= new LinkedHashMap();
		hm3.put("Telangana", "Hyderabad");
		hm3.put("Karntaka", "Warngal");
		System.out.println(hm3);
		
		
	}

}
