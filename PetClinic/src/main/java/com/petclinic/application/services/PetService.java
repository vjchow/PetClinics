package com.petclinic.application.services;

import java.util.Set;

import com.petclinic.application.model.Pet;

public interface PetService {
	
	Pet findById(Long id);

	Pet save(Pet owner);

	Set<Pet> findAll();

}
