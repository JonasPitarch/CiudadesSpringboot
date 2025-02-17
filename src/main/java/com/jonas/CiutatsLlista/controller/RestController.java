package com.jonas.CiutatsLlista.controller;

import com.jonas.CiutatsLlista.model.Entitats.Ciutat;
import com.jonas.CiutatsLlista.model.Entitats.Pais;
import com.jonas.CiutatsLlista.model.Entitats.Provincia;
import com.jonas.CiutatsLlista.model.Repositoris.CiutatRepository;
import com.jonas.CiutatsLlista.model.llistatService.Ciudadservice;
import com.jonas.CiutatsLlista.model.llistatService.PaisService;
import com.jonas.CiutatsLlista.model.llistatService.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/listado")
public class RestController {
    @Autowired
    private Ciudadservice ciudadservice;
    @Autowired
    private CiutatRepository ciutatRepository;
    @Autowired
    private ProvinciaService provinciaService;
    @Autowired
    private PaisService paisService;

    @CrossOrigin(origins = "http://localhost:5173/")
    @GetMapping("/ciudades")
    public List<Ciutat> obtenerCiudades() {
        return ciudadservice.getAll();
    }

    @PostMapping("/addciudad")
    public void anadirCiudad(@RequestBody Ciutat ciudad) {
//        ciudadservice.post(ciudad);
        ciutatRepository.save(ciudad);
    }

    @DeleteMapping("/delciudad/{id}")
    public void eliminarCiudad(@PathVariable Long id) {
        ciutatRepository.deleteById(id);
    }

    @GetMapping("/provincias")
    public List<Provincia> obtenerProvincias() {
        return provinciaService.getAll();
    }

    @GetMapping("/paises")
    public List<Pais> obtenerPaises() {
        return paisService.getAll();
    }
}