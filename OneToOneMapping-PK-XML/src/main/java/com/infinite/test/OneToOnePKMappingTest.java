package com.infinite.test;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infinite.entity.Library;
import com.infinite.entity.Student;
import com.infinite.util.HibernateUtil;

public class OneToOnePKMappingTest {
	
	private static Transaction tx;
	private static Session session=HibernateUtil.getSession();
	
	public static void main(String[] args) {
		saveStudent();
	}
	
	public static void saveStudent() {
		Library library=new Library(null,"Sivaji",null);	
		Student st=new Student(null,"Hyd","Pavan",23,null);
		st.setLibrary(library);
		library.setStudentDetails(st);
		tx=session.beginTransaction();
		session.save(st);
		tx.commit();
		
	}
	
	
}
