package com.Biosmart.Biosmart.services;

import java.util.ArrayList;
import java.util.Optional;

import com.Biosmart.Biosmart.models.CapacitacionModel;
import com.Biosmart.Biosmart.models.EquipoModel;
import com.Biosmart.Biosmart.repositories.CapacitacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CapacitacionService {

    @Autowired
    CapacitacionRepository capacitacionRepository;

    public ArrayList<CapacitacionModel> obtenerCapacitaciones() {
        return (ArrayList<CapacitacionModel>) capacitacionRepository.findAll();
    }

    public CapacitacionModel guardarCapacitacion(CapacitacionModel capacitacion) {
        return capacitacionRepository.save(capacitacion);
    }

    public Optional<CapacitacionModel> obtenerPorId(Long id) {
        return capacitacionRepository.findById(id);
    }

    public ArrayList<CapacitacionModel> obtenerPorEquipo(EquipoModel equipo) {
        return capacitacionRepository.findByEquipo(equipo);
    }

    public boolean eliminarCapacitacion(Long id) {
        try {
            capacitacionRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}