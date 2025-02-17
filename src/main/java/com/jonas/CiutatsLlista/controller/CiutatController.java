package com.jonas.CiutatsLlista.controller;

import com.jonas.CiutatsLlista.model.Entitats.Ciutat;
import com.jonas.CiutatsLlista.model.Repositoris.CiutatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ciutats")
public class CiutatController {

    @Autowired
    private CiutatRepository ciutatRepository;

    @GetMapping("")
    public String getAllCiutats(Model model) {
        List<Ciutat> ciutats = ciutatRepository.findAll();
        model.addAttribute("ciutats", ciutats);
        return "ciutats";
    }

}
