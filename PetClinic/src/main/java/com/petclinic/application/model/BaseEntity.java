package com.petclinic.application.model;

import java.io.Serializable;

public class BaseEntity implements Serializable{
	
	/**
	 * Implemented Serializable
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
