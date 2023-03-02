package com.adorno;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.modeloUno.ConcreteDosEntity;
import com.adorno.modeloUno.ConcreteEntity;
import com.adorno.modelomany.ManyConcreteEntity;
import com.adorno.modelomany.ManyOtherConcreteEntity;
import com.adorno.repos.ConcreteDosRepository;
import com.adorno.repos.ConcreteRepository;
import com.adorno.repos.ManyConcreteEntityRepository;
import com.adorno.repos.ManyOtherConcreteEntityRepository;

@SpringBootTest
class Jpa2305H2HerenciaApplicationTests {
	
//		prueba uno
	@Autowired
	ConcreteRepository concreteRepository;
	@Autowired
	ConcreteDosRepository concreteDosRepository;
//	prueba dos
	@Autowired
	ManyConcreteEntityRepository manyConcreteEntityRepository;
	@Autowired
	ManyOtherConcreteEntityRepository manyOtherConcreteEntityRepository;

	@Test
	void contextLoads() {
//		prueba uno
		//Esta prueba es para la herencia en una tabla
		concreteRepository.save(new ConcreteEntity("lagartija", "programador resolutivo"));
		concreteDosRepository.save(new ConcreteDosEntity("galibo","no sabe hacer nada"));
//		Prueba dos
		manyConcreteEntityRepository.save(new ManyConcreteEntity("lagartija", "programador resolutivo","alejandro pero no el que estais pensando"));
		manyOtherConcreteEntityRepository.save(new ManyOtherConcreteEntity("galibo","no sabe hacer nada","Fran pero otro"));
	}

}
