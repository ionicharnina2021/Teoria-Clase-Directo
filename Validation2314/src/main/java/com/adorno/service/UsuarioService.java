package com.adorno.service;

import org.springframework.stereotype.Service;

import com.adorno.model.Usuario;
import com.adorno.model.UsuarioRepository;

@Service
public class UsuarioService {

	private UsuarioRepository usuarioRepository;

	public UsuarioService() {
		super();
		usuarioRepository=new UsuarioRepository();
	}
	
	public boolean add(Long id, String nombre,String email) {
		return usuarioRepository.add(new Usuario(id, nombre, email));
	}
	
	
}
