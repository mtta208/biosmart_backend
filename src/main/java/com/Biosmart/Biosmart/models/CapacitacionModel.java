package com.Biosmart.Biosmart.models;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "capacitacion")
public class CapacitacionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_capacitacion;

    private String titulo;
    private String descripcion;

    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(mappedBy = "capacitacion")
    private List<ResultadoCapacitacionModel> resultados;

    @ManyToOne
    @JoinColumn(name = "id_equipo")
    private EquipoModel equipo;

    public Long getId_capacitacion() {
        return id_capacitacion;
    }

    public void setId_capacitacion(Long id_capacitacion) {
        this.id_capacitacion = id_capacitacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public EquipoModel getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoModel equipo) {
        this.equipo = equipo;
    }
}