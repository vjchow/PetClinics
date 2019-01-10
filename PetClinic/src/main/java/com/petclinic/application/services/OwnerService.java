package com.petclinic.application.services;

import java.util.Set;

import com.petclinic.application.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll(); 

}
