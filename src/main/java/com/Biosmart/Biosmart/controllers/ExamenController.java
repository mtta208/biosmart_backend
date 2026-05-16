package com.Biosmart.Biosmart.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.Biosmart.Biosmart.models.ExamenModel;
import com.Biosmart.Biosmart.services.ExamenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/examen")
public class ExamenController {

    @Autowired
    ExamenService examenService;

    @GetMapping()
    public ArrayList<ExamenModel> obtenerExamenes() {
        return examenService.obtenerExamenes();
    }

    @PostMapping()
    public ExamenModel guardarExamen(@RequestBody ExamenModel examen) {
        return this.examenService.guardarExamen(examen);
    }

    @GetMapping(path = "/{id}")
    public Optional<ExamenModel> obtenerExamenPorId(@PathVariable("id") Long id) {
        return this.examenService.obtenerPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {

        boolean ok = this.examenService.eliminarExamen(id);

        if (ok) {
            return "Se eliminó el examen con id " + id;
        } else {
            return "No pudo eliminar el examen con id " + id;
        }
    }

}