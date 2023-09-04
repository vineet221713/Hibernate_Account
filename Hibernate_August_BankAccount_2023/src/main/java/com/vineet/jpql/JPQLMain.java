package com.vineet.jpql;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;



import com.vineet.entity.Account;
import com.vineet.util.EMUtil;

public class JPQLMain {

	public static void main(String[] args) {
		EntityManager em = EMUtil.proviEntityManager();
		
		String jpql = "select a from Account a" ;

//		Query q = (Query) em.createQuery(jpql);
		
		List<Account> list = em.createQuery(jpql).getResultList();
		
		for(Account acc : list) {
			System.out.println(acc);
		}
		
		
		
	}
}
