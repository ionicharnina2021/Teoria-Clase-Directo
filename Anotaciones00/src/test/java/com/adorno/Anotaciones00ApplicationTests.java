package com.adorno;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Anotaciones00ApplicationTests {
	@Autowired
	SocioRepository socioRepository;

	@Test
	void contextLoads() {
		socioRepository.save(new Socio("Juan"));
		System.out.println("ya acabe");
	}

}
