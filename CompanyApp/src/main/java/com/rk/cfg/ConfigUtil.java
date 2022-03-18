package com.rk.cfg;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.rk.model.Company;

public class ConfigUtil {
private static SessionFactory sessionFactory;
public static SessionFactory getSessionFactory() {
	if(sessionFactory==null) {
		try {
		Configuration con=new Configuration();
		Properties properties=new Properties();
		properties.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/cdac");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "root");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		properties.put(Environment.SHOW_SQL, "true");
		properties.put(Environment.HBM2DDL_AUTO, "create-drop");
		con.setProperties(properties);
		con.addAnnotatedClass(Company.class);
		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
				.applySettings(con.getProperties()).build();
		sessionFactory=con.buildSessionFactory(serviceRegistry);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	return sessionFactory;
}

}

