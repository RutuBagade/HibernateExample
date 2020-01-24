package com.test;

import java.util.Date;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		User user = new User();
        //user.setUserId(2);
		user.setUsername("Ritesh");
		user.setCreatedBy("Doodle");
		user.setCreatedDate(new Date());

		session.save(user);
		session.getTransaction().commit();

	}

}
