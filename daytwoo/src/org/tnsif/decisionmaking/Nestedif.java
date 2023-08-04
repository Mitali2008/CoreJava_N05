package org.tnsif.decisionmaking;
import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         int age=sc.nextInt();
         int weight=sc.nextInt();
          if(age>=12);
          {
        	  if(weight>=40)
        	  System.out.println("ELIGIBLE");
        	  if(weight<=110){
        		  System.out.println("EXTRA ROPE");
        	  }
        	  
          
          else {
        	  System.out.println("NOT ELIGIBLE");}
          
	
        
          }

}}
