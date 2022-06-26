package com.infinite.test;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infinite.entity.Passport;
import com.infinite.entity.Person;
import com.infinite.util.HibernateUtil;

public class OneToOneFKMappingTest {
	
	private static Transaction tx;
	private static Session session=HibernateUtil.getSession();
	
	public static void main(String[] args) {
		savePerson();
	}
	
	public static void savePerson() {
		Person person=new Person(null,"Pavan","Hyd",23);
		Passport passport=new Passport(null,"India",new Date(),person);		
		tx=session.beginTransaction();
		session.save(passport);
		tx.commit();
		
	}
	
	
}
