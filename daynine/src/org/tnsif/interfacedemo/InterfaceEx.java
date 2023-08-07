package org.tnsif.interfacedemo;

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //we cannot create object for interface
		
	   // SBIDebitcard s=new SBIDebitcard();
		//s.displatCardDetails();
		//s.display();
		
		Debitcard.print();
		
		CheesePopCorn c=new CheesePopCorn();
		c.displayRecipe();
		
		
		Person p=new Person();
		p.showDrinkName();
		
		
		
		
	}

}
