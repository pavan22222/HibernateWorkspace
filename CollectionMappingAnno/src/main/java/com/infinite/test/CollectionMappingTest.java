package com.infinite.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.infinite.entity.Student;
import com.infinite.util.HibernateUtil;

public class CollectionMappingTest {
	public static void main(String[] args) {
		Session ses=null;
		ses=HibernateUtil.getSession();
		/*
		 * Transaction tx=null; boolean flag=true; ses=HibernateUtil.getSession();
		 * Integer retVal=null; try { tx=ses.beginTransaction(); Student st=new
		 * Student(); st.setName("Pavan"); st.setAge(23);
		 * st.setPhoneNumbers(Set.of(8374293058l, 7780110665l));
		 * st.setHobbies(List.of("Playing Cricket", "Listening Music"));
		 * st.setMarks(Map.of("Telugu", 78d,"English",87d)); retVal=(Integer)
		 * ses.save(st); }catch (Exception e) { flag=false; e.printStackTrace();
		 * }finally{ if(flag) { tx.commit();
		 * System.out.println("Student Saved with::"+retVal); }else { tx.rollback(); } }
		 */
		Query query=ses.createQuery("from com.infinite.entity.Student where sid=:sid");
		query.setParameter("sid", 1);
		List<Student> students=query.getResultList();
		students.forEach(System.out::println);
	}
}
