package org.tnsif.interfacedemo;

public interface Debitcard {
	
	//by default all the variable inside an interface is public static final and if 
	//it final then we must have to initialize value for the variable
	
	long cardn0=12345678932L;
	
	//we cannot use concrete method inside an interface
	//by default method inside interface is an abstract
	void displatCardDetails();
	default void display()
	//default method and static method is an new feature which can be used inside interface
	{
		System.out.println("Default method");
		
	}
	static void print()
	{
		System.out.println("static method");
	}
	
		
		
		
		
		
	}
	
	
	
	


