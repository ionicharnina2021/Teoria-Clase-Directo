package com.example.demo.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@IdClass(IDActividadGrupoMonitor.class)
public class ActividadGrupoMonitor {
	@Id
	@ManyToOne
	private Actividad actividad;
	@Id
	@ManyToOne
	private Grupo grupo;
	@ManyToOne
	private Monitor monitor;
	
	public ActividadGrupoMonitor(Actividad actividad, Grupo grupo, Monitor monitor) {
		super();
		this.actividad = actividad;
		this.grupo = grupo;
		this.monitor = monitor;
	}

	private ActividadGrupoMonitor() {
		super();
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	
	

}
