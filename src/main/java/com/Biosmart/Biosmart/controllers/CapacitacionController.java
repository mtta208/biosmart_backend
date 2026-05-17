package com.Biosmart.Biosmart.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.Biosmart.Biosmart.models.CapacitacionModel;
import com.Biosmart.Biosmart.services.CapacitacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/capacitacion")
public class CapacitacionController {

    @Autowired
    CapacitacionService capacitacionService;

    @GetMapping()
    public ArrayList<CapacitacionModel> obtenerCapacitaciones() {
        return capacitacionService.obtenerCapacitaciones();
    }

    @PostMapping()
    public CapacitacionModel guardarCapacitacion(@RequestBody CapacitacionModel capacitacion) {
        return this.capacitacionService.guardarCapacitacion(capacitacion);
    }

    @GetMapping(path = "/{id}")
    public Optional<CapacitacionModel> obtenerCapacitacionPorId(@PathVariable("id") Long id) {
        return this.capacitacionService.obtenerPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {

        boolean ok = this.capacitacionService.eliminarCapacitacion(id);

        if (ok) {
            return "Se eliminó la capacitación con id " + id;
        } else {
            return "No pudo eliminar la capacitación con id " + id;
        }
    }

}