package com.Biosmart.Biosmart.repositories;

import com.Biosmart.Biosmart.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

    public abstract UsuarioModel findByCorreo(String correo);

}