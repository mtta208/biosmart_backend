package com.Biosmart.Biosmart.repositories;

import java.util.ArrayList;

import com.Biosmart.Biosmart.models.ExamenModel;
import com.Biosmart.Biosmart.models.CapacitacionModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenRepository extends CrudRepository<ExamenModel, Long> {

    public abstract ArrayList<ExamenModel> findByCapacitacion(CapacitacionModel capacitacion);

}