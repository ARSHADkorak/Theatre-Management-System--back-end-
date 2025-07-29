package com.qsp.theatre_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.qsp.theatre_management_system.dao.AddressDao;
import com.qsp.theatre_management_system.dto.Address;
import com.qsp.theatre_management_system.exception.AddressNotFound;
import com.qsp.theatre_management_system.util.ResponseStructure;
import com.qsp.theatre_management_system.util.ResponseStructureForAll;

@Service
public class AddressService {

	@Autowired
	AddressDao addressDao;

	@Autowired
	ResponseStructure<Address> responseStructure;

	@Autowired
	ResponseStructureForAll<Address> responseStructureForAll;

	public ResponseStructure<Address> saveAddress(Address address) {
		responseStructure.setMessage("Address saved successfully in the DB");
		responseStructure.setStatuscode(HttpStatus.CREATED.value());
		responseStructure.setData(addressDao.saveAddress(address));
		return responseStructure;
	}

	public ResponseStructure<Address> fetchAddressById(int addressId) {
		
		Address address =  addressDao.fetchAddressById(addressId);
		if(address != null) {
			responseStructure.setMessage("Address fetched successfully from the DB");
			responseStructure.setStatuscode(HttpStatus.FOUND.value());
			responseStructure.setData(addressDao.fetchAddressById(addressId));
			return responseStructure;
		}
		else {
			throw new AddressNotFound();
		}
		
		
		
	}

	public ResponseStructureForAll<Address> fetchAllAddress() {
		responseStructureForAll.setMessage("All the address fetched succesfully from DB");
		responseStructureForAll.setStatuscode(HttpStatus.OK.value());
		responseStructureForAll.setAllData(addressDao.fetchAllAddress());
		return responseStructureForAll;

	}

	public ResponseStructure<Address> deleteAddressById(int addressId) {
		responseStructure.setMessage(" Address deleted successfully from the DB");
		responseStructure.setStatuscode(HttpStatus.OK.value());
		responseStructure.setData(addressDao.deleteAddressById(addressId));
		return responseStructure;
	}

	public ResponseStructure<Address> updateAddressById(int oldAddressId, Address address) {
		responseStructure.setMessage("Address updated succesfully in the DB");
		responseStructure.setStatuscode(HttpStatus.OK.value());
		responseStructure.setData(addressDao.updateAddressById(oldAddressId, address));
		return responseStructure;
	}

}
