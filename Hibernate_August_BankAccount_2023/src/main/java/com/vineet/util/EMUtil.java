package com.vineet.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {

	private static EntityManagerFactory emf ;
	
	static {
		emf = Persistence.createEntityManagerFactory("account-unit");
	}
	public static EntityManager proviEntityManager() {
		return emf.createEntityManager();
		
	}
}
