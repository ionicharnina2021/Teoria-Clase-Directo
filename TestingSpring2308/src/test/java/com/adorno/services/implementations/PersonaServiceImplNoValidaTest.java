package com.adorno.services.implementations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaServiceImplNoValidaTest {
	

	private PersonaServiceImplNoValida personaServiceImpl=new PersonaServiceImplNoValida();
	@Test
	void testGetPersons() {
		assertEquals(personaServiceImpl.getPersons().size(), 1);
	}

}
