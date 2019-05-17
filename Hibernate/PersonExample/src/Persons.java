package com.capgemini.person;
import org.hibernate.boot.registry.*;


import org.hibernate.boot.*;


import org.hibernate.*;


import javax.persistence.*;

@Entity
public class Persons {
	@Id
	int person_id;
	String person_name;
	
	public Persons(int pid, String pname)
	{
		person_id=pid;
		person_name=pname;
	}
	public Persons(){}
	@Override
	public String toString() {
		return ("Person name="+person_name+" and ID his/her is"+person_id); 
	}
} 