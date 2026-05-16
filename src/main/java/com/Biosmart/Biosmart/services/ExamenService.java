package com.Biosmart.Biosmart.services;

import java.util.ArrayList;
import java.util.Optional;

import com.Biosmart.Biosmart.models.ExamenModel;
import com.Biosmart.Biosmart.models.CapacitacionModel;
import com.Biosmart.Biosmart.repositories.ExamenRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamenService {

    @Autowired
    ExamenRepository examenRepository;

    public ArrayList<ExamenModel> obtenerExamenes() {
        return (ArrayList<ExamenModel>) examenRepository.findAll();
    }

    public ExamenModel guardarExamen(ExamenModel examen) {
        return examenRepository.save(examen);
    }

    public Optional<ExamenModel> obtenerPorId(Long id) {
        return examenRepository.findById(id);
    }

    public ArrayList<ExamenModel> obtenerPorCapacitacion(CapacitacionModel capacitacion) {
        return examenRepository.findByCapacitacion(capacitacion);
    }

    public boolean eliminarExamen(Long id) {
        try {
            examenRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}