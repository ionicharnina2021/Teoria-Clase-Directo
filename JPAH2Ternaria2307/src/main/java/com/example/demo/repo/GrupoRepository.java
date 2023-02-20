package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.Grupo;

public interface GrupoRepository extends CrudRepository<Grupo, Long> {

	public Optional<List<Grupo>> findByNameStartingWith(String begining);
	
}
