package com.example.isilsoft.repository;

import com.example.isilsoft.entity.Visita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitaRepository extends JpaRepository<Visita, Long> {

    boolean existsByDniAfiliado(String dniAfiliado);

}