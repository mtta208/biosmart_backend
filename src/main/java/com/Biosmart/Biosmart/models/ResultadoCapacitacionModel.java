package com.Biosmart.Biosmart.models;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "resultado_capacitacion")
public class ResultadoCapacitacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_resultado;

    private Double nota;
    private Boolean aprobado;

    @Temporal(TemporalType.DATE)
    private Date fecha_presentacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioModel usuario;

    @ManyToOne
    @JoinColumn(name = "id_capacitacion")
    private CapacitacionModel capacitacion;

    public Long getId_resultado() {
        return id_resultado;
    }

    public void setId_resultado(Long id_resultado) {
        this.id_resultado = id_resultado;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Date getFecha_presentacion() {
        return fecha_presentacion;
    }

    public void setFecha_presentacion(Date fecha_presentacion) {
        this.fecha_presentacion = fecha_presentacion;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public CapacitacionModel getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(CapacitacionModel capacitacion) {
        this.capacitacion = capacitacion;
    }
}