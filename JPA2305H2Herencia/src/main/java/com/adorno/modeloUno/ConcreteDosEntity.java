package com.adorno.modeloUno;

import jakarta.persistence.Entity;

//@Entity
public class ConcreteDosEntity extends AbstractEntity {
	private String consecucion;

	public ConcreteDosEntity(String nick, String consecucion) {
		super(nick);
		this.consecucion = consecucion;
	}

	public String getConsecucion() {
		return consecucion;
	}

	public void setConsecucion(String consecucion) {
		this.consecucion = consecucion;
	};
	
}
