package com.adorno.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adorno.model.Person;
import com.adorno.services.interfaces.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService {

	@Override
	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return null;
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
