package com.vineet.jpql;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.vineet.entity.Account;
import com.vineet.util.EMUtil;

public class Tyyped_Quiery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMUtil.proviEntityManager();
		String jpql = "from Account where name = 'raj' ";
		TypedQuery<Account> q = em.createQuery(jpql, Account.class);

		Account acc = q.getSingleResult();
		
		System.out.println(acc);
	}

}
