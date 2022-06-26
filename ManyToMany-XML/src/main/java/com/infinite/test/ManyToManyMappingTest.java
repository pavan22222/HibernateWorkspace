package com.infinite.test;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.infinite.entity.Doctor;
import com.infinite.entity.Patient;
import com.infinite.util.HibernateUtil;

public class ManyToManyMappingTest {
	
	private static Session ses=HibernateUtil.getSession();
	
	public static void main(String[] args) {
		//removeDoctorsOfPatient();
		saveDoctor();
	}
	
	public static void saveDoctor() {
		Patient p=new Patient(null,"Pavan",null);
		Doctor doctor=new Doctor(null,"Venkat",null);
		doctor.setPatients(List.of(p));
		p.setDoctors(Set.of(doctor));
		Transaction tx=ses.beginTransaction();
		ses.save(doctor);
		tx.commit();
	}
	

	public static void savePatient() {
		Patient p=new Patient(null,"Anil",null);
		Doctor doctor=new Doctor(null,"Rakesk",null);
		doctor.setPatients(List.of(p));
		p.setDoctors(Set.of(doctor));
		Transaction tx=ses.beginTransaction();
		ses.save(p);
		tx.commit();
	}
	
	public static void loadPatient() {
		Query query=ses.createQuery("select p from Patient p");
		List<Patient> list=query.getResultList();
		list.forEach(p->{
			System.out.println(p.getDoctors());
		});
		
	}
	
	public static void removeDoctorsOfPatient() {
		Transaction tx=ses.beginTransaction();
		Query query=ses.createQuery("select p from Patient p where p.patientId=:patient_id");
		query.setParameter("patient_id", 8);
		List<Patient> list=query.getResultList();
		Set<Doctor> doctors=list.get(0).getDoctors();
		doctors.removeAll(doctors);
		tx.commit();
	}
	
	

}
