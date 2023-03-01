package com.example.demo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.modelo.Direccion;
import com.example.demo.modelo.DireccionRepository;
import com.example.demo.modelo.Pedido;
import com.example.demo.modelo.PedidoRepository;
import com.example.demo.modelo.Persona;
import com.example.demo.modelo.PersonaRepository;
import com.example.demo.modelo.Seguro;

@SpringBootTest
class Jpa2303ApplicationTests {
	@Autowired
	PersonaRepository personaRepository;
	@Autowired
	DireccionRepository direccionRepository;
	@Autowired
	PedidoRepository pedidoRepository;

	@Test
	void contextLoads() {
		Direccion direccion = new Direccion("Rosa", 21);
		Persona persona = new Persona("Julio", "Capacino",direccion);
		direccionRepository.save(direccion);
		System.out.println("ya acabo");
//		Seguro seguro=new Seguro(1L,"uno que yo se");
//		persona.setSeguro(seguro);
		personaRepository.save(persona);
		Optional<Persona> findById = personaRepository.findById(1L);
//		System.out.println(findById.get().getSeguro());
		System.out.println(findById.toString());
		Optional<Direccion> findById2 = direccionRepository.findById(1L);
		Direccion direccion2 = findById2.get();
	}
	@Test
	void contextLoadsOneToMany() {
//		Persona persona1 = new Persona("Damian", "Higgins");
//		personaRepository.save(persona1);
//		Persona persona=personaRepository.findByNombre("Damian").get();
//		Pedido pedido=new Pedido(LocalDate.now(),150,persona);
//		Pedido pedidoaa=new Pedido(LocalDate.now(),150,persona);
//		Pedido pedidoab=new Pedido(LocalDate.now(),150,persona);
//		pedidoRepository.save(pedido);
//		pedidoRepository.save(pedidoaa);
//		pedidoRepository.save(pedidoab);
//		System.out.println("Lista de pedidos");
//		List<Pedido> findByPersona = pedidoRepository.findByPersona(persona);
//		System.out.println(findByPersona.size());
		
	}
}
