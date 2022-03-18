package com.app;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.domain.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration().configure("student.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		/*
		 * Query query=session.createQuery("From Employee where id=:empId");
		 * query.setParameter("empId", 101); List<Employee>list=query.getResultList();
		 * for(Employee e:list)
		 * System.out.println(e.getId()+" "+e.getEmail()+" "+e.getName()+" "+e.getDept()
		 
		 * );
		 */
		Query query=session.createQuery("delete from Employee where id="+101);
		//query.setParameter("empId", 101);
		//squery.setParameter("name", "Ram");
		int i=query.executeUpdate();
		System.out.println(i+" Row affected.");
	}

}
