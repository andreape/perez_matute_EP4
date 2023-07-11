package com.example.isilsoft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String local;
    private String dniAfiliado;
    private LocalDate fecha;
    private LocalTime hora;

    public Visita() {
        // Constructor vacío necesario para JPA
    }

    public Visita(String local, String dniAfiliado, LocalDate fecha, LocalTime hora) {
        this.local = local;
        this.dniAfiliado = dniAfiliado;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDniAfiliado() {
        return dniAfiliado;
    }

    public void setDniAfiliado(String dniAfiliado) {
        this.dniAfiliado = dniAfiliado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}