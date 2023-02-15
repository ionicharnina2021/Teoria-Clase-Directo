package com.adorno.services.implementations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonaServiceInjectionTest {
	
	@Autowired
	private PersonaServiceImpl personaServiceImpl;

	@Test
	void test() {
		assertEquals(personaServiceImpl.getPersons().size(),1);
	}

}
