package org.tnsif.polymorphism;
import java.util.Scanner;
class Laptop{
	
	
	
	String generation;
	void specification(String generation) {	
		
		 System.out.println("Laptop: "+generation);
	}

}
class Dell extends Laptop{

	String generation2;
	 void specification(String generation,String generation2) {
		 super. specification(generation); 
		 System.out.println("dell:"+generation2);
	 }



}

public class MethodOverridingE {

	public static void main(String[] args) {
		Dell d=new Dell();
		Scanner sc=new Scanner(System.in);
		String generation=sc.nextLine();
		String generation2=sc.nextLine();
		
		d.specification (generation,generation2);
	}

}
