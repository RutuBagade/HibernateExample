package com.dss;

import java.util.Date;

import org.hibernate.Session;

public class Test1 {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		      
		    ProductInfo product=new  ProductInfo();
		    
		   product.setProdName("Mobile");
		   product.setProdtype("Electronics");
		   product.setProdcost(5000);
		   
		   session.save(product);
		session.getTransaction().commit();

	}

}
