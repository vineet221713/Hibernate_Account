package com.vineet.main;

import javax.persistence.EntityManager;

import com.vineet.entity.Address;
import com.vineet.entity.Department;
import com.vineet.entity.Employee;
import com.vineet.util.EmUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EmUtil.provideEntityManager();
		Employee emp1 = new Employee();
		
		emp1.setEname("ram");
		emp1.setSalary(8500);
		
		Employee emp2 = new Employee();
		emp2.setEname("ramesh");
		emp2.setSalary(7500);
		
		Department dept = new Department();
		dept.setDname("HR");
		dept.setLocation("Location");
		
		dept.getEmps().add(emp1);
		dept.getEmps().add(emp2);
		
		
		em.getTransaction().begin();
		
		em.persist(emp1);
		em.persist(emp2);
        em.persist(dept);
        
        em.getTransaction().commit();
        em.close();
        System.out.println("done....");
	}

}
