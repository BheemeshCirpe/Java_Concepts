package com.java.oops;

public class Encapsulation_1 {
	
	private int rid;
	private String name;
	

	// setters (used to set the values to properties)
	public void Seteid(int id) {
		//this.id = id; //this keyword is used only when both local and instance variable names are same
		
		if(id>=18)
		rid=id;	
		else
		rid=100;
	}

	public void Setename(String name) {
		this.name = name;	
	}

	// getters (used to get the values from the properties)
	public int Geteid() {

		return rid;
	}
	
	public String Getename() {
		return name;
	}

	

}
