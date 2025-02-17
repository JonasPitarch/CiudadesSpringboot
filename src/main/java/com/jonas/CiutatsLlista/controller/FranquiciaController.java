package com.jonas.CiutatsLlista.controller;

import com.jonas.CiutatsLlista.model.Entitats.Franquicia;
import com.jonas.CiutatsLlista.model.Repositoris.FranquiciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/franquicias")
public class FranquiciaController {

    @Autowired
    private FranquiciaRepository franquiciaRepository;

    @GetMapping("")
    public String getAllFranquicias(Model model) {
        List<Franquicia> franquicias = franquiciaRepository.findAll();
        model.addAttribute("franquicias", franquicias);
        return "franquicia";
    }
}
