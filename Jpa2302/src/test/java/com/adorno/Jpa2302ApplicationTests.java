package com.adorno;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Jpa2302ApplicationTests {

	@Autowired
	PersonaRepository personaRepository;

	@Test
	void contextLoads() {
		personaRepository.save(new Persona("Alberto", "TiraAlfombra"));
		assertEquals(1, personaRepository.count());
		System.out.println("ya acabo");
	}

}
