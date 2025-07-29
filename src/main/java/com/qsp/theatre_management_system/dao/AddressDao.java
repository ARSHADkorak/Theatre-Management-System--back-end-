package com.qsp.theatre_management_system.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.theatre_management_system.dto.Address;
import com.qsp.theatre_management_system.repo.AddressRepo;

@Repository
public class AddressDao {

	@Autowired
	AddressRepo addressRepo;

	public Address saveAddress(Address address) {

		return addressRepo.save(address);
	}

	public Address fetchAddressById(int addressId) {
//		return addressRepo.findById(addressId).get();
		Optional<Address> address = addressRepo.findById(addressId);
		if (address.isEmpty()) {
			return null;
		} else {
			return address.get();
		}
	}

	public List<Address> fetchAllAddress() {
		return addressRepo.findAll();
	}

	public Address deleteAddressById(int addressId) {
		Address address = addressRepo.findById(addressId).get();
		addressRepo.delete(address);
		return address;
	}

	public Address updateAddressById(int oldAddressId, Address address) {
		address.setAddressId(oldAddressId);
		addressRepo.save(address);
		return address;
	}

}
