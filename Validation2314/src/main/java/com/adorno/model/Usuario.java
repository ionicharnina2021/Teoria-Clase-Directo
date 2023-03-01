package com.adorno.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Usuario {
	@NotNull
	private long id;
	
	@Size(min=4,max=12)
	private String name;
	@Email
	private String email;
	public Usuario(@NotNull long id, @Size(min = 4, max = 12) String name, @Email String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
}
