package com.vrnda.test;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;

import com.vrnda.entity.Employee;
import com.vrnda.util.HibernateUtil;

public class ComponentMappingTest {
	public static void main(String[] args) {
		/*
		 * Address addr1=new Address(); addr1.setDoorNo("4-181");
		 * addr1.setStreetName("Park Line"); addr1.setCity("Vizag");
		 * addr1.setPinCode(523541l);
		 * 
		 * Address addr2=new Address(); addr2.setDoorNo("3-181");
		 * addr2.setStreetName("Park Line"); addr2.setCity("Chennai");
		 * addr2.setPinCode(523421l); Employee emp1=new Employee(); Employee emp2=new
		 * Employee(); emp1.setName("Pavan"); emp1.setAge(23); emp1.setSalary(324444f);
		 * emp1.setAddrs(addr1);
		 * 
		 * emp2.setName("Rohit"); emp2.setAge(26); emp2.setSalary(544444f);
		 * emp2.setAddrs(addr2); Transaction tx=null; Session ses=null;
		 * ses=HibernateUtil.getSession(); boolean flag=true; try {
		 * tx=ses.beginTransaction(); ses.save(emp1); ses.save(emp2); } catch (Exception
		 * e) { flag=false; e.printStackTrace(); } finally { if(flag) tx.commit(); else
		 * tx.rollback(); if(ses!= null) { HibernateUtil.closeSession(ses);
		 * HibernateUtil.closeSessionFactory(); } }
		 */
		
		  Session ses=null;
		  ses=HibernateUtil.getSession(); 
		  Query query=ses.getNamedQuery("GET_QUERY");
		  query.setParameter(1, 61);
		  List<Employee> employees=query.getResultList();
		  employees.forEach(System.out::println);
		 
		
	}
}
