package com.company.implementationJDBC;

import com.company.dao.PersonaDAO;
import com.company.entities.Persona;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
public class PersonaDAOJdbc implements PersonaDAO {

	private AccessJdbc accessJdbc;

	public PersonaDAOJdbc(AccessJdbc accessJdbc) {
		super();
		this.accessJdbc = accessJdbc;
	}

	@Override
	public void create(Persona entidad) {
		// TODO Auto-generated method stub
	}

	@Override
	public Collection<Persona> findAll() {
		ResultSet conjuntoResultados = accessJdbc.execute("SELECT * FROM persona");
		Collection<Persona> personas = new ArrayList<>();
		try {
			int numeroDeColumnas = conjuntoResultados.getMetaData().getColumnCount();
			while (conjuntoResultados.next()) {
				Object[] resultado = new Object[numeroDeColumnas];
				for (int i = 1; i <= numeroDeColumnas; i++)
					resultado[i-1] = conjuntoResultados.getObject(i);
				personas.add(new Persona(resultado));
			} 
		} catch (Exception e) {
			return null;
		}
		return personas;
	}

	@Override
	public Persona findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
