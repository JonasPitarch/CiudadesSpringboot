package com.jonas.CiutatsLlista.controller;


import com.jonas.CiutatsLlista.model.Entitats.Pais;
import com.jonas.CiutatsLlista.model.Repositoris.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/paises")
public class PaisController {
    @Autowired
    private PaisRepository paisRepository;
    @GetMapping("")
    public String getAllPaises(Model model) {
        List<Pais> pais = paisRepository.findAll();
        model.addAttribute("pais", pais);
        return "paisos";
    }
}


