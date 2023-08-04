/*Write the program to calculate hotel tariff the room rent is 20% high during pick 
 * season(april-june and nov-dec) is also peak season
 * hint-use the switch cases) *
 * Sample input-Month=3,Rent,Day)  Calculate hotel budget  */



/*A microwave oven manufacturer recomments that when hitting two items,
 * and 50% to the hitting time and when hitting three items double the hitting time
 * Hitting more items at once is not recommended
 *  write a program to find out the recommended hitting time
 *  Sample item=2,hitting point=0.5
 */
package org.tnsif.challenges;

import java.util.Scanner;

public class Example {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		float rent=sc.nextFloat();
		int days=sc.nextInt();
		switch(month)
		{

		case 1:
		case 2:
		case 3: 
		case 7:
		case 8:
			System.out.println(rent*days);
			break;
		case 4:
		case 5:
		case 6: 
		case 9:
		case 10:
			System.out.println((rent+(rent*0.2))*days);
			break;
		default:
	
			System.out.println("INVALID");
			
			
					}
		
	}
	
	

}
