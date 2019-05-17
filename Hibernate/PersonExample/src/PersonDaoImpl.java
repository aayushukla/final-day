package com.capgemini.person.dao;
import org.hibernate.boot.registry.*;


import org.hibernate.boot.*;


import org.hibernate.*;


import javax.persistence.*;
import com.capgemini.person.hibernate.*;
import com.capgemini.person.*;


public class PersonDaoImpl implements PersonDAO {
	
	@Override
	public void addNewPerson(Persons person) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx= session.beginTransaction();
		session.save(person);
		tx.commit();
	}




}