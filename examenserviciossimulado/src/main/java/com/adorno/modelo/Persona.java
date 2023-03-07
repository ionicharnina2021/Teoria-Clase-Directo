package com.adorno.modelo;

import java.util.Objects;

public class Persona {
	private Long id;
	private String persona;
	public Persona(Long id, String persona) {
		super();
		this.id = id;
		this.persona = persona;
	}
	public Persona() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(persona);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(persona, other.persona);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPersona() {
		return persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}
	
}
