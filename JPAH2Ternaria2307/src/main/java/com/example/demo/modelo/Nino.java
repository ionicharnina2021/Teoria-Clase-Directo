package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Builder
@RequiredArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Nino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String nombre;
	@ManyToOne
	private Grupo grupo;
}
