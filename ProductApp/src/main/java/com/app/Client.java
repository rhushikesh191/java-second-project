package com.app;

//package com.app;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Product;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config = new Configuration().configure("product.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		Product product =new Product();
		product.setPRODID(11);
		product.setPid(1001);
		product.setPname("mobile");
		product.setPrice(20000.18);
		product.setDESCRIP("iphone phone");
		session.persist(product);
		
		tr.commit();
		System.out.println("data inserted successfully");
		session.close();
	}

}