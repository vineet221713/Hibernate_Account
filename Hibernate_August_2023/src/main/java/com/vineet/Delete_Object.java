package com.vineet;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Delete_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit"); 
		EntityManager em = emf.createEntityManager();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll which you want to delte ");
		int delete_roll = sc.nextInt();
		Student student = em.find(Student.class, delete_roll);
		
		if(student != null) {
			em.getTransaction().begin();
			em.remove(student);
			em.getTransaction().commit();
			
			System.out.println("Student are Removed");
		}
		else
			System.out.println("Student are not found");
		em.close();
		System.out.println("Done");
	}

}
