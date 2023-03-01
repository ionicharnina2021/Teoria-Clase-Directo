package com.company.dao;

import com.company.entities.Persona;

public interface PersonaDAO extends GenericDAO<Persona, Integer> {
	public Persona findByName(String name);
}