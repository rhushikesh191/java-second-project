package com.rk;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rk.cfg.ConfigUtil;
import com.rk.model.Company;

public class CompanyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory=ConfigUtil.getSessionFactory();
Session session=factory.openSession();
Transaction tr=session.beginTransaction();
Company company=new Company();
company.setCompanyId(1002001);
company.setAddress("Pune maharashtra");
company.setCompanyName("Interface11 pvt ltd");
company.setContact(67253541);
session.save(company);
tr.commit();
System.out.println("Save data");
session.close();


	}

}
