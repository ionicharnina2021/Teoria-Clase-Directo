package com.adorno.services.implementations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

import java.util.List;
import java.util.Optional;

import com.adorno.model.Person;
import com.adorno.services.interfaces.PersonaService;

@SpringBootTest
class OtroServiceTest {
	@MockBean
	PersonaService personaService;
	
	@Autowired
	OtroService otro;

	@Test
	void testTryInject() {
		given(this.personaService.getPersons()).willReturn(List.of(new Person("Juanillo", 21), new Person("Jose", 32)));
		assertEquals(otro.tryInject(),2);
	}

	@Test
	void testGetCosa() {
		given(this.personaService.getPersonById()).willReturn(Optional.of( new Person("Jose", 32)));
		assertEquals("Jose",otro.getCosa().getName());
	}

}
