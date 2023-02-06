package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//No permitimos que este campo sea nulo
	@Column(nullable = false)
	private String calle;
	private int numero=0;
	
	//Para mapear bidireccionalmente
	//en el lado no propietario de la relacion
	@OneToOne(mappedBy = "direccion")
	private Persona persona;
	
	public Direccion(String calle, int numero) {
		super();
		this.calle = calle;
		this.numero = numero;
	}

	
	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}

	public String getCalle() {
		return calle;
	}

	public int getNumero() {
		return numero;
	}
	@Override
	public String toString() {
//		return calle+" "+numero+ persona.getNombre();
		return calle+" "+numero;
	}
	
	
}
