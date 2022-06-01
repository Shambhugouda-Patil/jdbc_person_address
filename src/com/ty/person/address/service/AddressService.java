package com.ty.person.address.service;

	import com.ty.person.address.dao.AddressDao;
	import com.ty.person.address.dto.Address;

	public class AddressService {
		
		AddressDao dao = new AddressDao();
		
		public int saveAddress(Address address) {
			return dao.saveAddress(address);
		}
		
	

}
