package com.app.model;

import org.hibernate.cfg.Configuration;

import com.app.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Configuration config =new Configuration().configure("Employee.cfg.xml");
        SessionFactory factory =config.buildSessionFactory();
        Session session =factory.openSession();
        Transaction tr=session.beginTransaction();
        Employee emp=new Employee();
        emp.setId(101);
        emp.setName("rhushikesh");
        emp.setDesignation("developer");
        emp.setSal(10000);
        emp.setDept("IT");
        session.persist(emp);
        tr.commit();
        System.out.println("data inserted sucessfully");
        session.close();
        
        
        
        
	}

}
