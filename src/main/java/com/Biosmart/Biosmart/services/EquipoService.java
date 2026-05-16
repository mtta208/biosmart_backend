package com.Biosmart.Biosmart.services;

import java.util.ArrayList;
import java.util.Optional;

import com.Biosmart.Biosmart.models.EquipoModel;
import com.Biosmart.Biosmart.repositories.EquipoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {

    @Autowired
    EquipoRepository equipoRepository;

    public ArrayList<EquipoModel> obtenerEquipos() {
        return (ArrayList<EquipoModel>) equipoRepository.findAll();
    }

    public EquipoModel guardarEquipo(EquipoModel equipo) {
        return equipoRepository.save(equipo);
    }

    public Optional<EquipoModel> obtenerPorId(Long id) {
        return equipoRepository.findById(id);
    }

    public boolean eliminarEquipo(Long id) {
        try {
            equipoRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}