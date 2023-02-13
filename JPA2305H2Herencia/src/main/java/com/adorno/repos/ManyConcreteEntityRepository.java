package com.adorno.repos;

import org.springframework.data.repository.CrudRepository;

import com.adorno.modelomany.ManyConcreteEntity;

public interface ManyConcreteEntityRepository extends CrudRepository<ManyConcreteEntity, Integer> {

}
