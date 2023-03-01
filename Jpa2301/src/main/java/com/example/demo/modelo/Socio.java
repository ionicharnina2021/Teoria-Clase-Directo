package com.example.demo.modelo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Transient;

@Entity
@SecondaryTable(name="otra",pkJoinColumns = @PrimaryKeyJoinColumn(name="id_otra"))
public class Socio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="socio_Nombre",length = 12)
	private String nombre;
	
	@Basic
	private String apellidos;
	
	@Column(precision =2)
	private float flotante=334.666f;
	private int entero=45;
	
	private boolean booleano;
	
	@Column(precision = 3,scale=1)
	private byte bite=32;
	
	@Transient
	private double doble=5.66;
	
	@Column(table = "otra")
	private int otraTabla=8;
	
	public Socio(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
}
