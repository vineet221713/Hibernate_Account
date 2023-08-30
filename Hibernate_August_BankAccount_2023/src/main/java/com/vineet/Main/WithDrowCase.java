package com.vineet.Main;

import java.util.Scanner;

import com.vineet.dao.AccountDao;
import com.vineet.daoImpl.AccountDaoImpl;
import com.vineet.entity.Account;

public class WithDrowCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountDao dao = new AccountDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account no");

		int ano = sc.nextInt();
		
		Account acc = dao.findAccount(ano);
		
		if(acc==null) {
			System.out.println("account does not exist");
		}
		else {
			System.out.println("Enter withdrowl ammount");
			int amt = sc.nextInt();
			
			if(amt<=acc.getBalance()-amt);
			boolean f = dao.updateAccount(acc);
			if(f) {
				System.out.println("Please collect the case");
			}
			else {
				System.out.println("Insufficant Ammount");
			}
		}
		
	}

}
