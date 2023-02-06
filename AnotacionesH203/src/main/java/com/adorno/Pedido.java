package com.adorno;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne()
	@JoinColumn(name="socio")
	private Socio socio;
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Socio socio) {
		super();
		this.socio = socio;
	}

	public Long getId() {
		return id;
	}

	public Socio getSocio() {
		return socio;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", socio=" + socio + "]";
	}
	
}
