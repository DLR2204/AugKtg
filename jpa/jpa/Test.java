package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("apple");
		
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		
		
//		em.persist(emp);
		
//		em.merge(emp);
		
		Employee emp = em.find(Employee.class,10);
		
		em.remove(emp);
		
		
		System.out.println("Table is creted");
		
		em.getTransaction().commit();
		
		em.close();
	}

}
