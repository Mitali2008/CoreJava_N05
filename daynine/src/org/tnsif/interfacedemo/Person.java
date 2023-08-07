package org.tnsif.interfacedemo;

public class Person implements ColdDrink,Alcohol{

	@Override
	public void showDrinkName() {
		// TODO Auto-generated method stub
		
		
		System.out.println(brand+" "+alcoholname+" "+name);	
		
	}

}
