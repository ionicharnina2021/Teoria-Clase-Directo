package com.example.demo.modelo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {

	public List<Pedido> findByPersona(Persona persona);
}
