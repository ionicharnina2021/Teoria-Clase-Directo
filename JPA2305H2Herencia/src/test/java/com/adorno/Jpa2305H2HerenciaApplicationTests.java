package com.adorno;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.modeloUno.ConcreteDosEntity;
import com.adorno.modeloUno.ConcreteEntity;
import com.adorno.repos.ConcreteDosRepository;
import com.adorno.repos.ConcreteRepository;

@SpringBootTest
class Jpa2305H2HerenciaApplicationTests {
	
	@Autowired
	ConcreteRepository concreteRepository;
	@Autowired
	ConcreteDosRepository concreteDosRepository;

	@Test
	void contextLoads() {
		concreteRepository.save(new ConcreteEntity("lagartija", "programador resolutivo"));
		concreteDosRepository.save(new ConcreteDosEntity("galibo","no sabe hacer nada"));
	}

}
