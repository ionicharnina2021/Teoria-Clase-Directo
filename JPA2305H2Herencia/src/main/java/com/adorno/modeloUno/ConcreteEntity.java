package com.adorno.modeloUno;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;

//@Entity
public  class ConcreteEntity extends AbstractEntity {
	private String description;

	public ConcreteEntity(String nick, String description) {
		super(nick);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
