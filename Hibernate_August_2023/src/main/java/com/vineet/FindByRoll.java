package com.vineet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindByRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();
		
		Student student = em.find(Student.class, 20);
		
		if(student!=null) {
			System.out.println(student);
		}
		else
			System.out.println("Student are not exists");
		em.close();
	}
}
