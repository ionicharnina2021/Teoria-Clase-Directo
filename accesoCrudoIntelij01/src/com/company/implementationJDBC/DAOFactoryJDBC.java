package com.company.implementationJDBC;

import java.sql.SQLException;

import com.company.dao.DaoFactory;
import com.company.dao.PersonaDAO;

public class DAOFactoryJDBC extends DaoFactory {
	AccessJdbc accessJdbc;
	

	public DAOFactoryJDBC() throws ClassNotFoundException, SQLException {
		super();
		//EStos parametros pueden ser pasado por parametros o configurados en otro sitio
		accessJdbc=new AccessJdbc("Ejemplo", "root", "");
	}



	@Override
	public PersonaDAO getPersonaDAO() {
		return new PersonaDAOJdbc(accessJdbc);
	}

}
