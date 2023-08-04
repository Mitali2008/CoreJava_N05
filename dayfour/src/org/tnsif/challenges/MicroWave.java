
/*A microwave oven manufacturer re comments that when hitting two items,
 * and 50% to the hitting time and when hitting three items double the hitting time
 * Hitting more items at once is not recommended
 *  write a program to find out the recommended hitting time
 *  Sample item=2,hitting point=0.5
 */



package org.tnsif.challenges;

import java.util.Scanner;

public class MicroWave {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int item=sc.nextInt();
		float ht=sc.nextFloat();
		switch(item)
		{
		 case 1:
			System.out.println(ht);
		    break;
		    
		    
		 case 2:
				System.out.println((ht/2)+ht);
			    break;
			    
		 case 3:
				System.out.println("HEATING MORE THAN THREE ITEM ARE"+" IS NOT RECOMMENDED");
			    break;
		}
	}

}
