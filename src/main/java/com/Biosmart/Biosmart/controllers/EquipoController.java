package com.Biosmart.Biosmart.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.Biosmart.Biosmart.models.EquipoModel;
import com.Biosmart.Biosmart.services.EquipoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipo")
public class EquipoController {

    @Autowired
    EquipoService equipoService;

    @GetMapping()
    public ArrayList<EquipoModel> obtenerEquipos() {
        return equipoService.obtenerEquipos();
    }

    @PostMapping()
    public EquipoModel guardarEquipo(@RequestBody EquipoModel equipo) {
        return this.equipoService.guardarEquipo(equipo);
    }

    @GetMapping(path = "/{id}")
    public Optional<EquipoModel> obtenerEquipoPorId(@PathVariable("id") Long id) {
        return this.equipoService.obtenerPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {

        boolean ok = this.equipoService.eliminarEquipo(id);

        if (ok) {
            return "Se eliminó el equipo con id " + id;
        } else {
            return "No pudo eliminar el equipo con id " + id;
        }
    }

}