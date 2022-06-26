package com.infinite.test;

import java.util.Date;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infinite.entity.Mobile;
import com.infinite.entity.Sim;
import com.infinite.util.HibernateUtil;

public class OneToManyAnnoTest {
	
	private static Session ses=HibernateUtil.getSession();
	
	public static void main(String[] args) {
		//saveMobile();
		deleteSimOfMobile();
	}
	
	public static void saveMobile() {
		Sim sim=new Sim(null,"Airtel",new Date());
		Mobile mobile=new Mobile(null,"Realme",12000f,Set.of(sim));
		Transaction tx=ses.beginTransaction();
		ses.save(mobile);
		tx.commit();	
	}
	
	public static void deleteSimOfMobile() {
		Mobile mobile=ses.get(Mobile.class, 1l);
		Transaction tx=ses.beginTransaction();
		Set<Sim> sims=mobile.getSims();
		sims.removeAll(sims);
		tx.commit();	
	}
	
}
