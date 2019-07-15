package com.cg.mra.beans;

public class Account {
	private String accountType;
	private String customerName;
	private int accountBalance;
	private int rechargeAmount;
	
	//getters setters and constructors
	
	public int getRechargeAmount() {
		return rechargeAmount;
	}

	public void setRechargeAmount(int rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}

	public Account(String accountType, String customerName, int accountBalance ) {
		this.accountType = accountType;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountBalance() {
		return  accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "accountType=" + accountType + ", customerName=" + customerName + ", accountBalance="
				+ accountBalance ;
	}

	

	
	
	

}
