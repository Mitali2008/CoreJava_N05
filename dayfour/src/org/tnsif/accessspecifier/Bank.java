

package org.tnsif.accessspecifier;
public class Bank {
   public String bankName="SBI";
   private int pinNo;
   long accountno=326598741358L;
   
   
  public  void displayPublic()
  {
	  System.out.println("Bank name is:"+bankName);}
	  
	  
	  
	  private  void displayPrivate()
	  {
		  System.out.println("Pin No.is:"+pinNo);}
		  
		  
		  private  void displayDefault()
		  {
			  System.out.println("Account No.is:"+accountno);
			  
		  
  }
   
}
