package com.vrnda.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vrnda.entity.Address;
import com.vrnda.entity.Employee;
import com.vrnda.util.HibernateUtil;

public class CollectionMappingTest {
	public static void main(String[] args) {
/**		Address addr1=new Address();
		addr1.setDoorNo("1-181");
		addr1.setStreetName("Park Line");
		addr1.setCity("Hyd");
		addr1.setPinCode(523321l);
		
		Address addr2=new Address();
		addr2.setDoorNo("1-181");
		addr2.setStreetName("Park Line");
		addr2.setCity("Hyd");
		addr2.setPinCode(523321l);
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.setName("Pavan");
		emp1.setAge(23);
		emp1.setSalary(324444f);
		emp1.setAddrs(addr1);
		
		emp2.setName("Rohit");
		emp2.setAge(26);
		emp2.setSalary(544444f);
		emp2.setAddrs(addr2);
		Transaction tx=null;
		Session ses=null;
		ses=HibernateUtil.getSession();
		boolean flag=true;
		try {
			tx=ses.beginTransaction();
			ses.save(emp1);
			ses.save(emp2);
		} catch (Exception e) {
			flag=false;
			e.printStackTrace();
		} finally {
			if(flag)
				tx.commit();
			else
				tx.rollback();
			if(ses!= null) {
				HibernateUtil.closeSession(ses);
				HibernateUtil.closeSessionFactory();
			}
		}   */
		
		
		Session ses=null;
		ses=HibernateUtil.getSession();
		Employee emp=ses.get(Employee.class,61);
		System.out.println(emp);
		
	}
}
