package com.java.interview_questions;

public class IQ_A24_Singleton_Class {

	
	// static variable single_instance of type Singleton 
    private static IQ_A24_Singleton_Class single_instance = null; 
  
    // variable of type String 
    public String s; 
  
    // private constructor restricted to this class itself 
    private IQ_A24_Singleton_Class() 
    { 
        s = "Hello I am a string part of Singleton class"; 
    } 
  
    // static method to create instance of Singleton class 
    public static IQ_A24_Singleton_Class getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new IQ_A24_Singleton_Class(); 
  
        return single_instance; 
    } 
} 

