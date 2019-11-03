package com.java.collections_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sort_2 {
	public static void main(String[] args) {

		ArrayList<Product> a1 = new ArrayList<Product>();

		a1.add(new Product(5, "Coffee", 80.52));
		a1.add(new Product(1, "Tea", 20.12));
		a1.add(new Product(4, "Sprite", 10.85));
		a1.add(new Product(2, "Maaza", 90.01));
		a1.add(new Product(10, "Thumsup", 100.21));

		Iterator<Product> itr = a1.iterator();

		while (itr.hasNext()) {

			Product p1 = itr.next();

			System.out.println(p1.pid + " " + p1.pname + " " + p1.pcost);
		}

		Collections.sort(a1, new Pid_Sort());

		System.out.println("***After sorting with ID***");

		Iterator<Product> itr1 = a1.iterator();
		while (itr1.hasNext()) {

			Product p1 = itr1.next();

			System.out.println(p1.pid + " " + p1.pname + " " + p1.pcost);
		}

		Collections.sort(a1, new Pname_Sort());

		System.out.println("***After sorting with name***");

		Iterator<Product> itr2 = a1.iterator();
		while (itr2.hasNext()) {

			Product p1 = itr2.next();

			System.out.println(p1.pid + " " + p1.pname + " " + p1.pcost);
		}

	}
}

