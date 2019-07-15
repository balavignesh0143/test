package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDaoImpl;


public class AccountServiceImpl implements AccountServiceI{
	
	AccountDaoImpl daoObj=new AccountDaoImpl();
	public Account getAccountDetails(String mblNo)
	{
		return daoObj.getAccountDetails(mblNo);
		
	}
	public int rechargeAccount(String mblNo, int rechargeAmount) {
		return daoObj.rechargeAccount(mblNo,rechargeAmount);
		
	}
	
	

}
