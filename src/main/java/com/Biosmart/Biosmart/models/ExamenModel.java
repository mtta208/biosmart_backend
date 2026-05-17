package com.Biosmart.Biosmart.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "examen")
public class ExamenModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_examen;

    private String respuesta_1;
    private String respuesta_2;
    private String respuesta_3;
    private String respuesta_4;
    private String respuesta_5;

    @ManyToOne
    @JoinColumn(name = "id_capacitacion")
    private CapacitacionModel capacitacion;

    public Long getId_examen() {
        return id_examen;
    }

    public void setId_examen(Long id_examen) {
        this.id_examen = id_examen;
    }

    public String getRespuesta_1() {
        return respuesta_1;
    }

    public void setRespuesta_1(String respuesta_1) {
        this.respuesta_1 = respuesta_1;
    }

    public String getRespuesta_2() {
        return respuesta_2;
    }

    public void setRespuesta_2(String respuesta_2) {
        this.respuesta_2 = respuesta_2;
    }

    public String getRespuesta_3() {
        return respuesta_3;
    }

    public void setRespuesta_3(String respuesta_3) {
        this.respuesta_3 = respuesta_3;
    }

    public String getRespuesta_4() {
        return respuesta_4;
    }

    public void setRespuesta_4(String respuesta_4) {
        this.respuesta_4 = respuesta_4;
    }

    public String getRespuesta_5() {
        return respuesta_5;
    }

    public void setRespuesta_5(String respuesta_5) {
        this.respuesta_5 = respuesta_5;
    }

    public CapacitacionModel getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(CapacitacionModel capacitacion) {
        this.capacitacion = capacitacion;
    }
}