package com.adorno.services.implementations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.adorno.model.Person;
import com.adorno.services.interfaces.PersonaService;

@SpringBootTest
class PersonaServiceInjectionTestInterfaceOnly {
	
	@MockBean
	private PersonaService personaService;

	@Test
	void test() {
		given(this.personaService.getPersons()).willReturn(List.of(new Person("Juan", 22)));
		
		assertEquals(personaService.getPersons().size(),2);
	}

}
