package com.example.demo;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.modelo.Partido;
import com.example.demo.modelo.PartidoRepository;
import com.example.demo.modelo.Persona;
import com.example.demo.modelo.PersonaRepository;

@SpringBootTest
class Jpa2305ApplicationTests {
	@Autowired
	PersonaRepository personaRepository;

	@Autowired
	PartidoRepository partidoRepository;
	

	@Test
	void contextLoads() {
		Persona persona = new Persona("Julio", "Capacino");
		Persona persona1 = new Persona("Alberto", "Capacino");
		Persona persona2 = new Persona("susana", "Capacino");
		Persona persona3 = new Persona("Emilio", "Capacino");
		Partido partido=new Partido("tudelano","arroyoclarete");
		personaRepository.save(persona);
		personaRepository.save(persona1);
		personaRepository.save(persona2);
		personaRepository.save(persona3);
		partidoRepository.save(partido);
		List personas=new LinkedList<Persona>();
		personas.add(persona);
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		partido.setPersonas(personas);
		partidoRepository.save(partido);
		
		System.out.println("ya acabo");
		partidoRepository.findAll().forEach((par)->{
			par.getPersonas().forEach((per)->{
				System.err.println("persona "+per.toString());
			});
		});
	}

}
