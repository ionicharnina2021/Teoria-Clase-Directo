package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
public class Eso extends Nino{
	@ManyToOne
	private Tienda tienda;
}
