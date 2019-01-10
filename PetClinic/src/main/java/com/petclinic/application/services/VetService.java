package com.petclinic.application.services;

import java.util.Set;

import com.petclinic.application.model.Vet;

public interface VetService {
	
	Vet findById(Long id);

	Vet save(Vet owner);

	Set<Vet> findAll();
	
	

}
