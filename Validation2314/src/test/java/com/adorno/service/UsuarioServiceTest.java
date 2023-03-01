package com.adorno.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = UsuarioService.class)
class UsuarioServiceTest {

	
	private final UsuarioService usuarioService;
	
	
	public UsuarioServiceTest(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}


	@Test
	void testAdd() {
		assertTrue(usuarioService.add(null, "Terencio", "hola@gmail.com"));
	}

}
