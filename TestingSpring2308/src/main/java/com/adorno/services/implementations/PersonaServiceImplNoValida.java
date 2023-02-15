package com.adorno.services.implementations;

import java.util.List;
import java.util.Optional;

import com.adorno.model.Person;
import com.adorno.services.interfaces.PersonaService;


public class PersonaServiceImplNoValida implements PersonaService {

	@Override
	public List<Person> getPersons() {
		return List.of(new Person("Ramiro", 1));
	}

	@Override
	public Optional<Person> getPersonById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertPerson(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

}
