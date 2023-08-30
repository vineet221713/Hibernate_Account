package com.vineet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert_Object {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager();
		Student student = new Student(40, 600, "aman");
		
		Student s2 = new Student(12, 500, "suresh");

		
//        em.getTransaction().begin();
//		
//		em.persist(student);
//		
//		em.getTransaction().commit();

		em.getTransaction().begin();;
		em.persist(s2);
		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("done...");
		
		em.close();
		
	}
	
}
