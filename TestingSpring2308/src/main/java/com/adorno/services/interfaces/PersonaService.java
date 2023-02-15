package com.adorno.services.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adorno.model.Person;

@Service
public interface PersonaService {
	/**
	 * 
	 * @return
	 */
	 List<Person> getPersons();
	 Optional<Person> getPersonById();
	 boolean insertPerson(Person person);
}
