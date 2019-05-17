package com.capgemini.person.main;
import com.capgemini.person.dao.*;
import com.capgemini.person.*;
	
public class Main {
	public static void main(String args[])
	{
		PersonDAO person = new PersonDaoImpl();
		person.addNewPerson(new Persons(1,"Aayush"));
	}
}