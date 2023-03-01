package com.example.demo.modelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartidoRepository extends CrudRepository<Partido, Integer> {

}
