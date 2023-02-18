package com.adorno.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

import com.adorno.mappers.LinkedHashMapItemMapper;
import com.adorno.modelo.Item;

import reactor.core.publisher.Mono;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class ItemsControllerTest {
	
	WebClient webClient;
	Item cosas;
	
	@BeforeEach
	void before() {
		webClient = WebClient.create("http://localhost:8080");
        cosas= new Item(1, "cosas");
	}

	@Test
	void testRetrieveAList() {
		ResponseEntity<List> responseEntity=webClient
			.get()
			.uri("/items/all")
			.retrieve()
			.toEntity(List.class)
			.block();
		List body = responseEntity.getBody();
		//Este body es de un tipo concreto mirarlo en debug
		//observarás que en cada elemento de la list hay un hashmap (Esto pasa porque 
		//lo que viene de respuesta de la peticion http es un json)
		//Para obtener un item necesitamos un mapper. Observa como esta hecho
		List<Item> responseMapped= (List<Item>) body.stream()
			.map((hashMap)->{return new LinkedHashMapItemMapper().map((LinkedHashMap)hashMap);})
			.collect(Collectors.toList());
		assertEquals(cosas, responseMapped.get(0));
		System.out.println("temino con la respuesta de la lista");
	}
	
	@Test
	void testRetrieveAnElement() {
		ResponseEntity<Optional> responseEntity=webClient
				.get()
				.uri(uriBuilder->uriBuilder.path("/items/{id}").queryParam("id").build(1))
				
				.retrieve()
				.toEntity(Optional.class)
				.block();
		//Observa (con el debug) que lo que retorna es un ResponseEntity  de Optional
		//y dentro de este hay un hashMap (si encuentra el id). por lo tanto hay que mapear
		Optional<Item> optionalMapped = responseEntity.getBody()			
				.map((element) -> {return new LinkedHashMapItemMapper().map((LinkedHashMap) element);});
		assertEquals(cosas, optionalMapped.get());
		System.out.println("temino con get de un elemento");
	}

	 @Test
	    void testClientPostElementresponseEntity() {
		 //Si miras este recurso veras que lo retorna es un Item, no un optional
		 //esto lo hago para probar pero puedes utilizar el metodo /items/item que retorna un ResponseEntity
	        Item nuevo = new Item(32, "elementos nuevos");
	        ResponseEntity<Item> option = webClient.post().uri(uriBuilder -> uriBuilder.path("/items/newitem").build())
	                .body(Mono.just(nuevo), Item.class)
	                .retrieve()
	                .toEntity(Item.class)
	                .block();
	        Item optional = option.getBody();
	        assertEquals(nuevo,optional);
	        System.out.println("terminé post un elemento");
	    }
	
}
