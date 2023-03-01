package com.example.demo.modelo;

import java.time.LocalDate;

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
	private LocalDate localDate;
	private double amount;
	
	//La clave externa del pedido que es la kp persona
	@ManyToOne
	@JoinColumn(name = "persona")
	private Persona persona;
	
	public Pedido(LocalDate localDate, double aoumnt, Persona persona) {
		super();
		this.localDate = localDate;
		this.amount = aoumnt;
		this.persona = persona;
	}

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	@Override
	public String toString() {
		return " "+id;
	}
}
