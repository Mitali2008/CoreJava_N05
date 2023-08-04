package org.tnsif.decisionmaking;
import java.util.Scanner;
public class SwitchCase 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
           int button=sc.nextInt();
            switch(button) {
            case 1: System.out.println("Life goes on");
            break;
            case 2:System.out.println("perfect");
            break;
           case 3:System.out.println("Dynamite");
            break;
            default:
            System.out.println("Dynamite");
	}
	}}