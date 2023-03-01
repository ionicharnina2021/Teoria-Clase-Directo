package com.example.demo.modelo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long> {

	public Optional<Persona> findByNombre(String nombre);

}
