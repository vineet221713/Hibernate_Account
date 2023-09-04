package com.vineet.Main;

import com.vineet.dao.AccountDao;
import com.vineet.daoImpl.AccountDaoImpl;
import com.vineet.entity.Account;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		AccountDao dao = new AccountDaoImpl();
		
		Account acc1 = new Account();
		
		acc1.setName("juhi");
		acc1.setBalance(991);

		boolean f = dao.createAccount(acc1);
		
		if(f) {
			System.out.println("account created");
		}
		else 
			System.out.println("account are not created");
	}

}
