package com.adorno.test;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;

import com.adorno.modelo.Persona;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class PersonaControllerTest {
	WebClient webClient;

	@BeforeEach
	void bef() {
		webClient = WebClient.create("http://localhost:8080");
	}

	@Test
	void testGeAll() {
		// personas/nombresGrandes
		assertEquals(5,((List) webClient.get()
				.uri("/personas/all")
				.retrieve().toEntity(List.class).block().getBody()).size());
	}
	@Test
	void testGetNombreLongitud() {
		// personas/nombresGrandes
		assertEquals(4,((List) webClient.get()
				.uri((uriBuilder) -> uriBuilder.path("/personas/nombresgrandes").queryParam("longitud",4).build())
				.retrieve().toEntity(List.class).block().getBody()).size());
	}
	@Test
	void addPersonas(){
		long id = 6L;
		assertTrue(webClient.post().uri("/personas/persona").bodyValue(new Persona(id,"Ceferino")).retrieve().toEntity(Boolean.class).block().getBody());
		assertTrue(webClient.delete().uri(UriBuilder->UriBuilder.path("/personas/persona").queryParam("id", id).build()).retrieve().toEntity(Boolean.class).block().getBody());
	}

}
