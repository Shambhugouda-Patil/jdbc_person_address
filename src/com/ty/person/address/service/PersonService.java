package com.ty.person.address.service;

import com.ty.person.address.dao.PersonDao;
import com.ty.person.address.dto.Person;

public class PersonService {
		
		PersonDao dao = new PersonDao();
		
		public int savePerson(Person person) {
			return dao.savePerson(person);
		}
	}



