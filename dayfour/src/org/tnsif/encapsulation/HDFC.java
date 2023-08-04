//ENCAPSULATION ACHIEVE DATA USING PRIVATE DATA ACCESS SPECIFIER
package org.tnsif.encapsulation;
public class HDFC {
	private long accountNo;
	private int cvvNo;
	private String accountType;
	private int PinNo;
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPinNo() {
		return PinNo;
	}
	public void setPinNo(int pinNo) {
		PinNo = pinNo;
	}

}
