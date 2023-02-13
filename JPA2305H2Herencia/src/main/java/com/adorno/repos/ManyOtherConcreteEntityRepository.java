package com.adorno.repos;

import org.springframework.data.repository.CrudRepository;

import com.adorno.modelomany.ManyOtherConcreteEntity;

public interface ManyOtherConcreteEntityRepository extends CrudRepository<ManyOtherConcreteEntity, Integer> {

}
