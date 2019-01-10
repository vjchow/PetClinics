package com.petclinic.application.services;

import java.util.Set;

public class CrudService<T, ID> {
	
	Set<T> findAll();
	
	T findById(ID id);
	
	T save(T object);
	
	void delete(T object);
	void deleteById(T id);

}
