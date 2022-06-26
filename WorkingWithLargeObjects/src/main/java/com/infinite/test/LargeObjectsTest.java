package com.infinite.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.infinite.entity.JobSeeker;
import com.infinite.util.HibernateUtil;

public class LargeObjectsTest {
	
	public static void main(String[] args) throws IOException {
			Session ses=HibernateUtil.getSession();
			Transaction tx=null;
			JobSeeker seeker=null;
			FileInputStream photo=new FileInputStream("F:\\Pavan_Images\\pavan.jpg");
			BufferedReader resume= new BufferedReader(new FileReader("F:\\1028276.docx"));
			seeker=new JobSeeker(null, null, "Pavan", "B.Tech", photo.readAllBytes(), resume.toString().toCharArray());
			tx=ses.beginTransaction();
			System.out.println(ses.save(seeker));
			tx.commit();
		
	}

}
