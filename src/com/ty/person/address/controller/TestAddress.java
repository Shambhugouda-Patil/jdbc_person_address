package com.ty.person.address.controller;

	import java.util.ArrayList;
	import java.util.List;

	import com.ty.person.address.dao.AddressDao;
	import com.ty.person.address.dto.Address;

	public class TestAddress {
		
		public static void main(String[] args) {
			List<Address> list = new ArrayList();
			Address address = new Address();
//			address.setAid(2);
//			address.setStreet("BTR");
//			address.setDoor_num("3");
//			address.setCity("Bangalore");
//			address.setPin(560019);
//			address.setPid(1);
			
			AddressDao dao = new AddressDao();
			
//			int res = dao.saveAddress(address);
//			if(res > 0) {
//				System.out.println("Data is inserted successfully");
//			}
//			else
//				System.out.println("Something went wrong");
			
			list=dao.getAddressById(address, 1);
			System.out.println(list);
		}
	}



