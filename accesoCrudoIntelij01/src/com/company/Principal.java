package com.company;

import java.sql.SQLException;
import java.util.Collection;

import com.company.dao.DaoFactory;
import com.company.dao.PersonaDAO;
import com.company.entities.Persona;
import com.company.implementationJDBC.DAOFactoryJDBC;

public class Principal {

	public static void main(String[] args) {
		try {			
			DaoFactory daoFactory=new DAOFactoryJDBC();
			PersonaDAO personaDAO=daoFactory.getPersonaDAO();
			Collection<Persona> findAll = personaDAO.findAll();
			findAll.stream().forEach((a)->{System.out.println(a);});
			System.out.println("acabe");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
