package com.deloitte.jpaProect;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AppQuery {
	 public static void main( String[] args )
	    {
	    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("employee");
	    	EntityManager em=emf.createEntityManager();
	    	
//	    	Query q=em.createQuery("from Employee e where salary>60000");
//	    	List<Employee>list=q.getResultList();
//	    	for(Employee e:list) {
//	    		System.out.println(e);
//	    	}
	    	emf.close();    	
	    }
}