package com.qsp.theatre_management_system.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.theatre_management_system.dto.Address;
import com.qsp.theatre_management_system.dto.Branch;
import com.qsp.theatre_management_system.dto.Manager;
import com.qsp.theatre_management_system.repo.AddressRepo;
import com.qsp.theatre_management_system.repo.BranchRepo;
import com.qsp.theatre_management_system.repo.ManagerRepo;

@Repository
public class BranchDao {

	@Autowired
	BranchRepo branchRepo;

	@Autowired
	ManagerRepo managerRepo;

	@Autowired
	AddressRepo addressRepo;

	public Branch saveBranch(Branch branch) {
		return branchRepo.save(branch);
	}

	public Branch fetchBranchById(int branchId) {
		Optional<Branch> branch = branchRepo.findById(branchId);
		if (branch.isEmpty()) {
			return null;
		} else {
			return branch.get();
		}

	}

	public List<Branch> fetchAllBranch() {

		return branchRepo.findAll();
	}

	public Branch deleteBranchId(int branchId) {

		Branch branch = branchRepo.findById(branchId).get();
		branchRepo.delete(branch);
		return branch;
	}

	public Branch updateBranchById(int oldBranchId, Branch newBranch) {

		newBranch.setBranchId(oldBranchId);
		branchRepo.save(newBranch);
		return newBranch;
	}

	public Branch saveExistingManagerToExistingBranch(int manaderId, int branchId) {

		Branch branch = fetchBranchById(branchId);
		Manager manager = managerRepo.findById(manaderId).get();
		branch.setManager(manager);
		return saveBranch(branch);

	}

	public Branch addExistingAddressToExistingBranch(int addressId, int branchId) {

		Branch branch = fetchBranchById(branchId);
		Address address = addressRepo.findById(branchId).get();
		branch.setAddress(address);
		return saveBranch(branch);

	}

}
