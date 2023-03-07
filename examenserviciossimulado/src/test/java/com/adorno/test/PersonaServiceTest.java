package com.adorno.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.services.PersonaService;

@SpringBootTest
class PersonaServiceTest {

	@Autowired
	PersonaService personaService;
	
	@Test
	void test() {
		assertEquals(4, personaService.getNombreMayorXcaracteres(4).get().size());
	}

}
