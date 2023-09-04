package com.vineet.jpql;

import java.util.List;

import javax.*;

import javax.persistence.EntityManager;

import com.mysql.cj.Query;
import com.vineet.util.EMUtil;

public class ByUsing_PosinalParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	/*	
		//BY Positional ParamEter

		EntityManager em = EMUtil.proviEntityManager();
		
		String jpql= "update Account set balance=balance+?5 where name=?6";
		
         javax.persistence.Query q = em.createQuery(jpql);

         q.setParameter(5, 1000);
         q.setParameter(6, "Rahul");
         
         em.getTransaction().begin();
 		int x=q.executeUpdate();
 		em.getTransaction().commit();
 		
 		
 		System.out.println(x+" record updated...");

	*/
 		
 		//BY Name PARARAMETER
 		
 		
/*
		EntityManager em= EMUtil.provideEntityManager();
		
		
		String jpql= "update Account set balance=balance+:bal where name=:nm";
		
		Query q= em.createQuery(jpql);
		
		q.setParameter("bal", 600);
		q.setParameter("nm", "Ram");
		
		em.getTransaction().begin();
		int x=q.executeUpdate();
		em.getTransaction().commit();
		
		
		System.out.println(x+" record updated...");

 		*/
 		
 		
		
		//Multiple Row;
		
         EntityManager em= EMUtil.proviEntityManager();
		
		
		String jpql= "select name,balance from Account";
		
		javax.persistence.Query q= em.createQuery(jpql);

	
	
	 	List<Object[]> results= q.getResultList();
	 
	 	for(Object[] or: results) {
	 		
	 		 String name= (String)or[0];
	 		 int balance= (Integer)or[1];
	 		
	 		 System.out.println("Name is "+name);
	 		 System.out.println("Balance is :"+balance);
	 		 
	 		System.out.println("===========================");

 		
	}

	}
	}
