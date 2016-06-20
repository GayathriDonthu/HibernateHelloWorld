package com.hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentMain {
	public static void main(String[] args) {
		StudentMain sm = new StudentMain();
		sm.save();
		
	}
	
	public void save(){
		Student s = new Student();
		s.setId(10);
		s.setName("kishore");
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		sess.save(s);
		sess.getTransaction().commit();
		
		
	}
}
