package com.Biosmart.Biosmart.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.Biosmart.Biosmart.models.ResultadoCapacitacionModel;
import com.Biosmart.Biosmart.services.ResultadoCapacitacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resultado_capacitacion")
public class ResultadoCapacitacionController {

    @Autowired
    ResultadoCapacitacionService resultadoCapacitacionService;

    @GetMapping()
    public ArrayList<ResultadoCapacitacionModel> obtenerResultados() {
        return resultadoCapacitacionService.obtenerResultados();
    }

    @PostMapping()
    public ResultadoCapacitacionModel guardarResultado(@RequestBody ResultadoCapacitacionModel resultado) {
        return this.resultadoCapacitacionService.guardarResultado(resultado);
    }

    @GetMapping(path = "/{id}")
    public Optional<ResultadoCapacitacionModel> obtenerResultadoPorId(@PathVariable("id") Long id) {
        return this.resultadoCapacitacionService.obtenerPorId(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {

        boolean ok = this.resultadoCapacitacionService.eliminarResultado(id);

        if (ok) {
            return "Se eliminó el resultado con id " + id;
        } else {
            return "No pudo eliminar el resultado con id " + id;
        }
    }

}