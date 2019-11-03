package com.java.collections_sorting;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Sort_1 {

	public static void main(String[] args) {

		LinkedList<Emp> l1 = new LinkedList<Emp>();

		l1.add(new Emp(5, "rupa"));
		l1.add(new Emp(10, "bheemesh"));
		l1.add(new Emp(1, "Banana"));
		l1.add(new Emp(3, "apple"));

		Iterator<Emp> itr = l1.iterator();

		while (itr.hasNext()) {

			Emp obj = itr.next();
			System.out.println(obj.id + " " + obj.name);

		}
		
		
		Collections.sort(l1);
		
		
		System.out.println("****After Sorting****");

		Iterator<Emp> itr1 = l1.iterator();

		while (itr1.hasNext()) {

			Emp obj = itr1.next();
			System.out.println(obj.id + " " + obj.name);

		}
	}

}

class Emp implements Comparable {
	int id;
	String name;

	public Emp(int id, String name) {

		this.id = id;
		this.name = name;

	}

	@Override
	public int compareTo(Object o) {

		Emp e = (Emp) o;
		if (id == e.id)
			return 0;
		else if (id > e.id)
			return 1;
		else
			return -1;
	}

}