package com.Biosmart.Biosmart.repositories;

import java.util.ArrayList;

import com.Biosmart.Biosmart.models.ResultadoCapacitacionModel;
import com.Biosmart.Biosmart.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultadoCapacitacionRepository extends CrudRepository<ResultadoCapacitacionModel, Long> {

    public abstract ArrayList<ResultadoCapacitacionModel> findByUsuario(UsuarioModel usuario);

}