/*Pratik is so intrested in gardening and hence he plant more trees in his garden.
 * he plants trees in rectangular fashion with order of rows and coloumns and 
 * nums the trees in row wise order.
 * He planted the Mango tree only in the first row ,first column ,last column.
 * 	So,given the tree no.and rows and columns Your task is to find 
 * out whether the given tree is Mango tree or not.
 *n=5 , t=11*/


package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor {
  static void isMangoTree(int n,int t)
	{
		 if(t%n==0 || t%n==1 || t<=n)
			 System.out.println("Mango Tree");
		 
  
  else 
  {

	  
	  System.out.println(" Not Mango Tree");
	}
		}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 System.out.println(" Enter values of n and t:");
	 int n=sc.nextInt();
	 int t=sc.nextInt();
	 isMangoTree(n,t);
	 }
	
}

