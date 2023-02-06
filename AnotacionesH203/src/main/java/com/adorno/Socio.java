package com.adorno;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Socio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Pedido> pedidos;
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public Socio(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Socio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
