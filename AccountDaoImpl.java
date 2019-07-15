package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;


public  class AccountDaoImpl implements AccountDaoI{
	Account Obj;
	Map<String,Account> accountEntry;
	
	public AccountDaoImpl() {
		
		this.accountEntry = new HashMap();
		accountEntry.put("9865552465",new Account("Prepaid","krish",200));
		accountEntry.put("7502006855",new Account("Prepaid","sorna",453));
		accountEntry.put("7502006856",new Account("Prepaid","shajid",631));
		accountEntry.put("7502006857",new Account("Prepaid","padma",521));
		accountEntry.put("7502006858",new Account("Prepaid","ram",632));
	}
	public HashMap<String,Account> accountEntry()
	{
		return accountEntry();
	}

	public Account getAccountDetails(String mblNo) {
		Obj=accountEntry.get(mblNo);
		if(accountEntry.containsKey(mblNo))
		{
			System.out.println("Your current Balance is : "+Obj.getAccountBalance());
		}
		else
		{
			System.out.println("Given account id does not exists");
		}
		
		return Obj;
		
		
	}
	

	public int rechargeAccount(String mblNo, int rechargeAmount) {
		Obj=accountEntry.get(mblNo);
		int bal=Obj.getAccountBalance();
		if(accountEntry.containsKey(mblNo))
		{
			int amt=bal+rechargeAmount;
		    Obj.setAccountBalance(amt);
			System.out.println("Your Account Recharged Successfully ");
			System.out.println("Hello "+Obj.getCustomerName()+" ,Available balance is "+amt);
		
		}
		else
		{
			System.out.println("Cannot Recharge Account as Given mobile number does not exists");
		}
		return rechargeAmount;
	}

}


























