package com.adorno.modelo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends PagingAndSortingRepository<Persona, Long> {

	
}
