package com.example.demo.modelo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Entity
@Data
public  class Actividad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descripcion;
	
	@OneToMany(mappedBy = "actividad")
	private List<ActividadGrupoMonitor> actividades=new ArrayList<>();

	public List<ActividadGrupoMonitor> getActividades() {
		return actividades;
	}

	public void setActividades(List<ActividadGrupoMonitor> actividades) {
		this.actividades = actividades;
	}

	public Actividad(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public Actividad() {
		super();
	}
	@Override
	public String toString() {
		return descripcion;
	}

	public Long getID() {
		return id;
	}
	
}
