package com.dss;



import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		 Employee e1=new Employee();    
		     
		    e1.setFirstName("Rahul");    
		    e1.setLastName("pise");    
		    
		    
		   session.save(e1);
		   
		session.getTransaction().commit();

	}

}
