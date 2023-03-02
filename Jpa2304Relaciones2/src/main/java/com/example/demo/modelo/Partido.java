package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Partido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nombreEquipoUno, nombreEquipoDos;

	@ManyToMany(fetch = FetchType.EAGER)
//	(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "persona_partido", 
//		joinColumns = { @JoinColumn(name = "partido") }
//	, inverseJoinColumns = {@JoinColumn(name = "persona") })
	private List<Persona> personas;

	public Partido(String nombreEquipoUno, String nombreEquipoDos) {
		super();
		this.nombreEquipoUno = nombreEquipoUno;
		this.nombreEquipoDos = nombreEquipoDos;
	}

	public Partido() {
		super();
	}

	public String getNombreEquipoUno() {
		return nombreEquipoUno;
	}

	public void setNombreEquipoUno(String nombreEquipoUno) {
		this.nombreEquipoUno = nombreEquipoUno;
	}

	public String getNombreEquipoDos() {
		return nombreEquipoDos;
	}

	public void setNombreEquipoDos(String nombreEquipoDos) {
		this.nombreEquipoDos = nombreEquipoDos;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

}
