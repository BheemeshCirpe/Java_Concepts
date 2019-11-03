package com.java.map;

import java.util.TreeMap;

public class Map_2 {

	public static void main(String[] args) {
		
		TreeMap<Character,Integer> TM= new TreeMap<Character, Integer>();
		TM.put('c', 10);
		TM.put('a', 11);
		TM.put('b', 15);
		TM.put('c', 18);  //if we give duplicate key it will replace already existing value
		
		//TM.put("Test", 10);
		System.out.println(TM);
		
		

	}

}
