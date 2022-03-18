package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config = new Configuration().configure("Student.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
	     Student st=new Student();
	     st.setId(102);
	     st.setName("avinash");
	     st.setCity("satara");
	     
	     session.persist(st);
		
		
		
		tr.commit();
		System.out.println("data inserted successfully");
		session.close();
	}

}
