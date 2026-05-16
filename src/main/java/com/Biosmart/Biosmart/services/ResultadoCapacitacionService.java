package com.Biosmart.Biosmart.services;

import java.util.ArrayList;
import java.util.Optional;

import com.Biosmart.Biosmart.models.ResultadoCapacitacionModel;
import com.Biosmart.Biosmart.models.UsuarioModel;
import com.Biosmart.Biosmart.repositories.ResultadoCapacitacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultadoCapacitacionService {

    @Autowired
    ResultadoCapacitacionRepository resultadoCapacitacionRepository;

    public ArrayList<ResultadoCapacitacionModel> obtenerResultados() {
        return (ArrayList<ResultadoCapacitacionModel>) resultadoCapacitacionRepository.findAll();
    }

    public ResultadoCapacitacionModel guardarResultado(ResultadoCapacitacionModel resultado) {
        return resultadoCapacitacionRepository.save(resultado);
    }

    public Optional<ResultadoCapacitacionModel> obtenerPorId(Long id) {
        return resultadoCapacitacionRepository.findById(id);
    }

    public ArrayList<ResultadoCapacitacionModel> obtenerPorUsuario(UsuarioModel usuario) {
        return resultadoCapacitacionRepository.findByUsuario(usuario);
    }

    public boolean eliminarResultado(Long id) {
        try {
            resultadoCapacitacionRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}