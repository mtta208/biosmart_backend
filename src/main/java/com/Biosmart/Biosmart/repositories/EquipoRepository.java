package com.Biosmart.Biosmart.repositories;

import com.Biosmart.Biosmart.models.EquipoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends CrudRepository<EquipoModel, Long> {

}