package com.example.demo.modelo;

import java.io.Serializable;

public class IDActividadGrupoMonitor implements Serializable {
	private Grupo grupo;
	private Actividad actividad;
	public IDActividadGrupoMonitor(Grupo grupo, Actividad actividad) {
		super();
		this.grupo = grupo;
		this.actividad = actividad;
	}
	public IDActividadGrupoMonitor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
