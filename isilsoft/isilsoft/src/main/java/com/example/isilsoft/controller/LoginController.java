package com.example.isilsoft.controller;

import com.example.isilsoft.service.VisitaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final VisitaService visitaService;

    public LoginController(VisitaService visitaService) {
        this.visitaService = visitaService;
    }

    @PostMapping("/login")
    public String login(@RequestParam("usuario") String usuario, @RequestParam("contrasena") String contrasena) {
        if (visitaService.validarLogin(usuario, contrasena)) {
            return "redirect:/visitas";
        } else {
            return "redirect:/login?error";
        }
    }

}