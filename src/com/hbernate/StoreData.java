package com.hbernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class StoreData {
	public static void main(String[] args) {
		
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		  
		

		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		Transaction t=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setId(1630);
		e1.setFirstName("uma");
		e1.setLastName("mageshwari");
		
		session.save(e1);
		t.commit();
		System.out.println("Successfully saved");
		factory.close();
		session.close();
		

		}

}
