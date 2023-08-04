package org.tnsif.accessspecifierdemo;
import org.tnsif.accessspecifier.Bank;
public class BankExecutor {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.bankName="SBI";
		b.displayPublic();
		/* Pin no and displayPrivate() method are private, so we camt access into another class and another packaged
		 * we are not able to accesss into annother package,only we can access withoin the same package*/
	

	}

}
