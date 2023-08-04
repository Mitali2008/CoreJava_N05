package org.tnsif.decisionmaking;
import java.util.Scanner ;
public class CascadeifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int age1=sc.nextInt();
         int age2=sc.nextInt();
         int age3=sc.nextInt();
         if(age1>age2 && age2>age3)
         {
        	 System.out.println("Age1 is greater: +Age1");
        	 }
        	 
        	 
        		 else if(age2>age1 && age2>age3) {
        		 System.out.println("Age2 is greater: +Age2");
        		 }
        	 
        		 else {
        			 System.out.println("Age3 is greater: +Age3");
        			 
        	 }
        	 
        	 
         }
	}


