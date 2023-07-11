package com.example.isilsoft.controller;

import com.example.isilsoft.entity.Visita;
import com.example.isilsoft.service.VisitaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class VisitaController {

    private final VisitaService visitaService;

    public VisitaController(VisitaService visitaService) {
        this.visitaService = visitaService;
    }

    @GetMapping("/visitas")
    public String obtenerVisitas(Model model) {
        model.addAttribute("visitas", visitaService.obtenerVisitas());
        return "visitas";
    }

    @PostMapping("/visitas")
    public String crearVisita(@RequestParam("local") String local,
                              @RequestParam("dniAfiliado") String dniAfiliado,
                              @RequestParam("fecha") String fecha,
                              @RequestParam("hora") String hora) {
        LocalDate fechaVisita = LocalDate.parse(fecha);
        LocalTime horaVisita = LocalTime.parse(hora);
        Visita visita = new Visita(local, dniAfiliado, fechaVisita, horaVisita);
        visitaService.crearVisita(visita);
        return "redirect:/visitas";
    }

    @DeleteMapping("/visitas/{id}/eliminar")
    public String eliminarVisita(@PathVariable("id") Long id) {
        visitaService.eliminarVisita(id);
        return "redirect:/visitas";
    }

}