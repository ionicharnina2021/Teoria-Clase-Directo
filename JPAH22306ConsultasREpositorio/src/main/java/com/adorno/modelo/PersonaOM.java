package com.adorno.modelo;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PersonaOM {
	int numero=1000;

	public List<Persona> getPersonas(){
		LinkedList<Persona> personas = new LinkedList<>();
		List<String> nombres = List.of("Rodrigo", "Romualdo", "Alejandro", "Antonio", "Eduardo");
		List<String> apellidoUno = List.of("Gomez", "Hernandez", "Garcia", "Lalanda", "Tyson");
		List<String> apellidoDos = List.of("Carvajal", "Nunez", "Gonzalez", "Cuellar", "Diaz");
		final int edadMaxima = 70;
		nombres.forEach((nombre) -> {
			apellidoUno.forEach((apellidoElemento) -> {
				apellidoDos.forEach((apellidosDosElenento) -> {
					personas.add(new Persona(nombre, apellidoElemento +" "+ apellidosDosElenento,
							new Random().nextInt(edadMaxima),numero++));
				});
			});
		});
		return personas;
	}
}
