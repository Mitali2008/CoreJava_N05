//program to demonstrate on compile time Polymorphism



package org.tnsif.polymorphism;
import java.util.Scanner;
class Bollywood
{
	
	String str1,str2,str3;
	static void display( String str1,String str2)
	{
	
	System.out.println(str1+"loves"+str2);
	
	}
	static void display( String str1,String str2,String str3)
	{
	
	System.out.println(str1+"loves"+str2+"AS WELL AS"+str3);
	
	}
	
	
	
	
}


public class MethodOverloadingExecutor {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THREE STRING");
		String str1=sc.next();
		String str2=sc.next();
		String str3=sc.next();
		Bollywood.display(str1,str2);
		Bollywood.display(str1,str2,str3);
		
		

}}
