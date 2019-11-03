package com.java.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Map_4 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(5, "blue");
		lhm.put(6, "red");
		lhm.put(1, "red");
		lhm.put(10, "green");

		Set keys = lhm.keySet();
		Iterator<Integer> itr = keys.iterator();

		while (itr.hasNext()) {

			Integer key=itr.next();
			System.out.println(key+" "+lhm.get(key));
			
		}

	}

}
