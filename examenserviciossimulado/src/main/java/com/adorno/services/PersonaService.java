package com.adorno.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adorno.modelo.Persona;

@Service
public class PersonaService {

	private final com.adorno.repositorios.PersonaRepository personaRepository;

	public PersonaService(com.adorno.repositorios.PersonaRepository personaRepository) {
		super();
		this.personaRepository = personaRepository;
	}
	
	public Optional<List<Persona>> getNombreMayorXcaracteres(int caracteres){
		return Optional.of(personaRepository.findAll().stream()
				.filter((persona)->persona.getPersona().length()>caracteres).toList());
	}

	public List<Persona> getAll() {
		return personaRepository.findAll();
	}

	public Boolean addPersona(Persona persona) {
		return personaRepository.save(persona);
	}

	public Boolean deletePersona(Long id) {
		return personaRepository.delete(id);
	}
	
}
