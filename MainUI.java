package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int ch;
		Scanner scan=new Scanner(System.in);
		
		
		AccountServiceImpl Obj=new AccountServiceImpl();
		
		do {
			System.out.println("1-Account Details \n2-Recharge Amount \n3-Exit");
			System.out.println("Enter your choice : ");
		    ch=scan.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter mbl no : ");
			String mblNo=mobileCheck(scan.next());
			Obj.getAccountDetails(mblNo);
			break;
				
		case 2:
			System.out.println("Enter mbl no : ");
			String mblNo1=mobileCheck(scan.next());
			System.out.println("Enter recharge amount : ");
			int rechargeAmount=scan.nextInt();
			Obj.rechargeAccount(mblNo1,rechargeAmount);
			break;
			
		case 3:
			System.exit(0);
			break;
			
		}
		
		
	}while(ch<4);
	}

	public static  String mobileCheck(String mblNo) {
		while(true) {
			if(String.valueOf(mblNo).length() < 10) {
				System.out.println("Enter valid mobile number.");
				
				mblNo = sc.next();
			}
			else {
				return mblNo;
			}
		}
		
	}

}


























