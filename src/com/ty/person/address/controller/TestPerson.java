package com.ty.person.address.controller;

	import com.ty.person.address.dto.Person;
	import com.ty.person.address.service.PersonService;

	public class TestPerson {
		
		public static void main(String[] args) {
			
			Person person = new Person();
			person.setPid(1);
			person.setName("ravi");
			person.setEmail("ravi@gmail.com");
			person.setPhone("9520459554");
			PersonService service = new PersonService();
			
			int res = service.savePerson(person);
			if(res>0) {
				System.out.println("data is inserted successfully");
			}
			else
				System.out.println("Something went wrong");
		}
	}

