

//Circle challenge
package org.tnsif.challenges;

import java.util.Scanner;

public class XYZ {
 static	int survive(int n,int k)
	{
		if(n==1)
		 return 1;
		else
			return(survive (n-1,k)+k-1)%n+1;
	}
	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      System.out.println(survive(n,k));
      
	}                                                                                                                           

}
