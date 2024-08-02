package com.deloitte.jpaProect;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("employee");
    	EntityManager em=emf.createEntityManager();
    	
    	Employee e=em.find(Employee.class, 1);
    	System.out.println(e);
    	
    	em.getTransaction().begin();
    	Employee e1=new Employee(27,"Shub",101,Date.valueOf("1985-01-15"),50000);
    	em.persist(e1);
    	
      em.getTransaction().commit();
    	em.getTransaction().begin();
        Employee emp = new Employee();
        emp.setEmpid(111);
        emp.setName("John Doe");
        emp.setDeptid(101);
        emp.setDob(Date.valueOf("1985-01-15"));
        emp.setSalary(50000);
        em.persist(emp);
        em.getTransaction().commit();
        
        Employee e2=em.find(Employee.class, 111);
    	System.out.println(e2);
    	
    	Query q=em.createQuery("from Employee e  ");
    	List<Employee>list=q.getResultList();
    	for(Employee eq:list) {
    		System.out.println(eq);
    	}
    	emf.close();   
    }
}
