package com.java.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_5 {

	public static void main(String[] args) {
		
	LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer, String>();
	
	lhm.put(1,"rupa");
	lhm.put(2, "shilpa");
	lhm.put(3, "Bheemesh");
	lhm.put(4, "Alu");
	
	for(Map.Entry m:lhm.entrySet())
		
		System.out.println(m.getKey()+"-------"+m.getValue());
		
	}

}
