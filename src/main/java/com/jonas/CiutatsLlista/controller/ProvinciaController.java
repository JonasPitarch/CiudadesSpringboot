package com.jonas.CiutatsLlista.controller;

import com.jonas.CiutatsLlista.model.Entitats.Pais;
import com.jonas.CiutatsLlista.model.Entitats.Provincia;
import com.jonas.CiutatsLlista.model.Repositoris.PaisRepository;
import com.jonas.CiutatsLlista.model.Repositoris.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/provincias")
public class ProvinciaController {
    @Autowired
    private ProvinciaRepository provinciaRepository;
    @GetMapping("")
    public String getAllProvincies(Model model) {
        List<Provincia> provincias = provinciaRepository.findAll();
        model.addAttribute("provincia", provincias);
        return "provincies";
    }
}
