package com.adorno.modeloUno;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nick;

	public AbstractEntity(String nick) {
		this.nick = nick;
	}

	public AbstractEntity() {
		super();
	}

}
