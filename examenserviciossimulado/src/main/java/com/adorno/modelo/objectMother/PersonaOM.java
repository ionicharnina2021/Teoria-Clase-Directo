package com.adorno.modelo.objectMother;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.adorno.modelo.Persona;

@Service
public class PersonaOM {

	public List<Persona> getPersonas(){
		LinkedList<Persona> personas=new LinkedList<>();
		String[] nombres={"Amancio","Tiburcio","Salustiana","Clementina","ana"};
		for (int i = 0; i < nombres.length; i++) {
			personas.add(new Persona((long)i, nombres[i]));
		}
		return personas;
	}
}
