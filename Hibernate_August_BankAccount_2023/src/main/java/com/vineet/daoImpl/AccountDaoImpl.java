package com.vineet.daoImpl;

import javax.persistence.EntityManager;

import com.vineet.dao.AccountDao;
import com.vineet.entity.Account;
import com.vineet.util.EMUtil;

public class AccountDaoImpl implements AccountDao {

	@Override
	public boolean createAccount(Account account) {
	
		boolean flag = false ;
		EntityManager em = EMUtil.proviEntityManager();
		em.getTransaction().begin();
		em.persist(account);
		flag = true;
		em.getTransaction().commit();
		em.close();
		return flag ;
	}

	@Override
	public boolean deleteAccount(int accno) {
		boolean flag = false ;
		EntityManager em = EMUtil.proviEntityManager();
		
		Account acc = em.find(Account.class, accno);
		
		if(acc != null) {
			em.getTransaction().begin();
			em.remove(acc);
			flag = true ;
			em.getTransaction().commit();
		}
		em.close();
		return flag ;
	}

	@Override
	public boolean updateAccount(Account account) {
		// TODO Auto-generated method stub
  boolean flag = false ;
  EntityManager em = EMUtil.proviEntityManager();
  em.getTransaction().begin();
  em.merge(account);
  flag = true;
  
  em.getTransaction().commit();
  em.close();
  return flag ;
		
	}

	@Override
	public Account findAccount(int accno) {
		// TODO Auto-generated method stub
		EntityManager em = EMUtil.proviEntityManager();
		/*Account account=null;
		 EntityManager em=EMUtil.provideEntityManager();
		 	account = em.find(Account.class, accno);
			return account;*/
		return EMUtil.proviEntityManager().find(Account.class, accno);
		
	}

	
}
