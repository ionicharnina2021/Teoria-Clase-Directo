package com.adorno;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Anotaciones01ApplicationTests {
	@Autowired
	SocioRepository socioRepository;
	@Autowired
	PedidoRepository pedidoRepository;
	@Test
	void contextLoadsConCreate() {
		socioRepository.save(new Socio("Juan"));
		Optional<Socio> findById = socioRepository.findById(1L);
		Socio socio = findById.get();
		Pedido pedido = new Pedido(socio);
		pedidoRepository.save(pedido);
		socio.getPedidos().add(pedido);
		socioRepository.save(socio);
	}
	
	@Test
	void contextLoadsConUpdate() {
		Optional<Socio> findById = socioRepository.findById(1L);
		Socio socio = findById.get();
		System.out.println(socio.getPedidos().get(0));
	}

}
