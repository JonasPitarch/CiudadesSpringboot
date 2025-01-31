package com.jonas.CiutatsLlista.controller;

import com.jonas.CiutatsLlista.model.Entitats.Ciutat;
import com.jonas.CiutatsLlista.model.Entitats.Pais;
import com.jonas.CiutatsLlista.model.Entitats.Provincia;
import com.jonas.CiutatsLlista.model.llistatService.CiutatPoblacioMinimaService;
import com.jonas.CiutatsLlista.model.llistatService.PaisObtenirTotsService;
import com.jonas.CiutatsLlista.model.llistatService.ProvinciaObtenirPerPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/localitzacions")
public class LocalitzacioRestController {
    @Autowired
    private PaisObtenirTotsService paisService;

    @Autowired
    private CiutatPoblacioMinimaService ciutatService;

    @Autowired
    private ProvinciaObtenirPerPaisService provinciaService;

    @GetMapping("/paisos")
    public List<Pais> obtenirTotsElsPaisos(){
        return paisService.obtenirTotsElsPaisos();
    }

    @GetMapping ("/provincies")

    public List<Provincia> obtenirProvinciesPerPais(@RequestParam String nomPais){
        return provinciaService.obtenirProvinciesPerPais(nomPais);
    }

    @GetMapping("/ciutats")
    public List<Ciutat> obtenirCiutatAmbPoblacioMinima(@RequestParam int poblacioMinima){
        return ciutatService.obtenirCiutatAmbPoblacioMinima(poblacioMinima);
    }


}
