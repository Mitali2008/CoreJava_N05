//driver class contain main method

package org.tnsif.encapsulation;

public class EncapsulatiomDemo {

	public static void main(String[] args) {
		HDFC h=new HDFC();
				h.setAccountNo(1234567891478L);
				h.setAccountType("Current Account");
				h.setPinNo(6589);
				h.setCvvNo(2233);
				System.out.println(h.getAccountNo());
				System.out.println(h.getAccountType());
				System.out.println(h.getCvvNo());
				System.out.println(h.getPinNo());
	}

}
