package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.modelo.Persona;
import com.example.demo.modelo.PersonaRepository;
import com.example.demo.modelo.Socio;
import com.example.demo.modelo.SocioRepository;

@SpringBootTest
class Jpa2301ApplicationTests {
	
	@Autowired
	PersonaRepository personaRepository;
	@Autowired
	SocioRepository socioRepository;

	@Test
	void contextLoads() {
		personaRepository.save(new Persona("Antonio"));
		personaRepository.save(new Persona("Miranda"));
		socioRepository.save(new Socio("Salustiano", "Merendez"));
		System.out.println("hecho");
	}

}
