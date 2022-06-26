package com.infinite.test;

import java.util.Date;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infinite.entity.Mobile;
import com.infinite.entity.Sim;
import com.infinite.util.HibernateUtil;

public class ManyToOneAnnoTest {
	
	private static Session ses=HibernateUtil.getSession();
	
	public static void main(String[] args) {
		saveSim();
		deleteSimOfMobile();
	}
	
	public static void saveSim() {
		Mobile mobile=new Mobile(null,"Realme",12000f);
		Sim sim=new Sim(null,"Airtel",new Date(),mobile);		
		Transaction tx=ses.beginTransaction();
		ses.save(sim);
		tx.commit();	
	}
	
	public static void deleteSimOfMobile() {
		Mobile mobile=ses.get(Mobile.class, 1l);
		Transaction tx=ses.beginTransaction();
		//Set<Sim> sims=mobile.getSims();
		//sims.removeAll(sims);
		tx.commit();	
	}
	
}
