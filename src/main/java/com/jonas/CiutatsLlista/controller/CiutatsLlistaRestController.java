package com.jonas.CiutatsLlista.controller;

import com.jonas.CiutatsLlista.model.Entitats.Ciutat;
import com.jonas.CiutatsLlista.model.Entitats.Pais;
import com.jonas.CiutatsLlista.model.Entitats.Provincia;
import com.jonas.CiutatsLlista.model.Repositoris.CiutatRepository;
import com.jonas.CiutatsLlista.model.Repositoris.PaisRepository;
import com.jonas.CiutatsLlista.model.Repositoris.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CiutatsLlistaRestController {

    @Autowired
    private CiutatRepository ciutatRepository;

    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Autowired
    private PaisRepository paisRepository;

    @GetMapping("/ciudades")
    public List<Ciutat> obtenerCiudades() {
        return ciutatRepository.findAll();
    }

    @GetMapping("/provincias")
    public List<Provincia> obtenerProvincias() {
        return provinciaRepository.findAll();
    }

    @GetMapping("/paises")
    public List<Pais> obtenerPaises() {
        return paisRepository.findAll();
    }
}
