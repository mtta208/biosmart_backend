package com.Biosmart.Biosmart.repositories;

import java.util.ArrayList;

import com.Biosmart.Biosmart.models.CapacitacionModel;
import com.Biosmart.Biosmart.models.EquipoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapacitacionRepository extends CrudRepository<CapacitacionModel, Long> {

    public abstract ArrayList<CapacitacionModel> findByEquipo(EquipoModel equipo);

}