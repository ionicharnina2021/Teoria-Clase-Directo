package com.adorno.services.implementations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

import java.util.Optional;

import com.adorno.model.Person;

class OtroServiceTest {
	@Autowired
	OtroService otro;
	
	@MockBean
	PersonaServiceImp personaService;

	@Test
	void testTryInject() {
		given(this.personaService.getPersons().size()).willReturn(1);
		assertEquals(otro.tryInject(),1);
	}

	@Test
	void testGetCosa() {
		given(this.personaService.getPersonById()).willReturn(Optional.of( new Person("Jose", 32)));
		assertEquals("Jose",otro.getCosa().getName());
	}

}
