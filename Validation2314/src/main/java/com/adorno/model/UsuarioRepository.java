package com.adorno.model;

import java.util.LinkedList;

public class UsuarioRepository {
	LinkedList<Usuario> usuarios=new LinkedList<>();
	
	public boolean add(Usuario usuario) {
		return usuarios.add(usuario);
	}
}
