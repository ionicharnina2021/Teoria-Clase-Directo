package com.adorno.services.implementations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.services.interfaces.PersonaService;

@SpringBootTest
class PersonaServiceInjectionTestInterfaceOnly {
	
	@Autowired
	private PersonaService personaService;

	@Test
	void test() {
		assertEquals(personaService.getPersons().size(),1);
	}

}
