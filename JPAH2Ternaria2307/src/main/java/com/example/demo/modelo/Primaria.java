package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
public class Primaria extends Nino{
	@ManyToOne
	private Cabana cabana;

}
