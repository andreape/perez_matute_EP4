package com.example.isilsoft.service;

import com.example.isilsoft.entity.Visita;
import com.example.isilsoft.repository.VisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitaService {

    private final VisitaRepository visitaRepository;

    @Autowired
    public VisitaService(VisitaRepository visitaRepository) {
        this.visitaRepository = visitaRepository;
    }

    public boolean validarLogin(String usuario, String contrasena) {
        // Lógica de validación de login
        return false; // Reemplaza esto con la lógica adecuada
    }

    public void crearVisita(Visita visita) {
        if (visitaRepository.existsByDniAfiliado(visita.getDniAfiliado())) {
            // Manejo de error cuando el DNI del afiliado ya existe
        } else {
            visitaRepository.save(visita);
        }
    }

    public void actualizarVisita(Visita visita) {
        if (visitaRepository.existsByDniAfiliado(visita.getDniAfiliado())) {
            // Manejo de error cuando el DNI del afiliado ya existe
        } else {
            visitaRepository.save(visita);
        }
    }

    public List<Visita> obtenerVisitas() {
        return visitaRepository.findAll();
    }

    public void eliminarVisita(Long id) {
        visitaRepository.deleteById(id);
    }

}