package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellidos;
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "persona")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Pedido> pedidos;
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}


	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}


	public Seguro getSeguro() {
		return seguro;
	}


	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}


	@Embedded
	private Seguro seguro;
	
	@OneToOne
//	@JoinColumn(name="ID_DIR")
	private Direccion direccion;

	public Persona(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	
	public Persona() {
		super();
	}


	public Persona(String nombre, String apellidos, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}


	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + "]";
	}


	public String getNombre() {
		return nombre;
	}
	
	
	
}
