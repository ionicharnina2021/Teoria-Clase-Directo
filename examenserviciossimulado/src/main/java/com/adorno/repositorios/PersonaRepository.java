package com.adorno.repositorios;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.adorno.modelo.Persona;
import com.adorno.modelo.objectMother.PersonaOM;

@Repository
public class PersonaRepository {
	
	private final PersonaOM personaOM;
	private List<Persona> personas;
	
	public PersonaRepository(PersonaOM personaOM) {
		super();
		this.personaOM = personaOM;
		personas=this.personaOM.getPersonas();
	}

	public List<Persona> findAll() {
		return personas;
		
	}

	public boolean save(Persona persona) {
		return personas.add(persona);
	}

	public Boolean delete(Long id) {
		return personas.removeIf((persona)->persona.getId()==id);
	}
	
	
		
		
}
