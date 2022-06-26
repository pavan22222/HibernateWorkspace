package com.infinite.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infinite.entity.Mobile;
import com.infinite.entity.Sim;

public class HibernateUtil {
	
	private static SessionFactory factory;
	private static Session ses;
	
	static {
		Configuration cfg=new Configuration();
		cfg.configure("com/infinite/cfgs/hibernateConfiguration.xml");
		cfg.addAnnotatedClass(Sim.class);
		cfg.addAnnotatedClass(Mobile.class);		
		factory=cfg.buildSessionFactory();
	}
	
	public static Session getSession() {
		if(ses == null)
			ses=factory.openSession();
		return ses;		
	}
	
	public void closeSession(Session ses) {
		if(ses != null)
			ses.close();
	}

}
