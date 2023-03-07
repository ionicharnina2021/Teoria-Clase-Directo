package com.adorno.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adorno.modelo.Persona;
import com.adorno.services.*;

@RestController
@RequestMapping("personas")
public class PersonaController {
	private final PersonaService personaService;

	public PersonaController(PersonaService personaService) {
		super();
		this.personaService = personaService;
	}

	@GetMapping("nombresgrandes")
	public ResponseEntity<List<Persona>> getByNameLong(@RequestParam int longitud) {
		return  personaService.getNombreMayorXcaracteres(longitud)
				.map((lista) -> new ResponseEntity<List<Persona>>(lista, HttpStatus.OK))
				.orElse(new ResponseEntity<List<Persona>>(HttpStatus.NOT_FOUND));
	}
	@GetMapping("all")
	public List<Persona> getAll(){
		return personaService.getAll();
	}
	
	@PostMapping("persona")
	public ResponseEntity<Boolean> addPersona(@RequestBody Persona persona ){
		Boolean addPersona = personaService.addPersona(persona);
		return new ResponseEntity<Boolean> (addPersona,addPersona?HttpStatus.OK:HttpStatus.FORBIDDEN);
	}
	
	@DeleteMapping("persona")
	public ResponseEntity<Boolean> deletePersona(@RequestParam Long id){
		Boolean delete=personaService.deletePersona(id);
		return new ResponseEntity<Boolean> (delete,delete?HttpStatus.OK:HttpStatus.FORBIDDEN);
	}
}
