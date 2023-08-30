package com.vineet.Main;

import java.util.Scanner;

import com.vineet.dao.AccountDao;
import com.vineet.daoImpl.AccountDaoImpl;
import com.vineet.entity.Account;

public class DepositeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AccountDao dao = new AccountDaoImpl();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Account Number");
		
		int ano = sc.nextInt();
		Account acc = dao.findAccount(ano);
		
		if(acc== null) {
			System.out.println("Account does not exists");
		}
		else {
			System.out.println("enter ammount");
			int amt =sc.nextInt();
			acc.setBalance(acc.getBalance()+amt);
			
			boolean f = dao.updateAccount(acc);
			if(f) {
				System.out.println("deposite Sucessful");
			}
			else
				System.out.println("Technical Error");
			
		}
			
	}

}
