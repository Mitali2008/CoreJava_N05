package org.tnsif.classandobjects;

public class Citizen {
 String CitizenType;
 long aadharno;
 String gender;
 String city;
public Citizen() {
	
 
	 System.out.println("Demonstration on default constructor");}
	 
 public Citizen(String citizenType, long aadharno, String gender, String city) {
	super();
	CitizenType = citizenType;
	this.aadharno = aadharno;
	this.gender = gender;
	this.city = city;
	
	
	
}

@Override
public String toString() {
	return "Citizen [CitizenType=" + CitizenType + ", aadharno=" + aadharno + ", gender=" + gender + ", city=" + city
			+ "]";
}

 
 
 
 
}
