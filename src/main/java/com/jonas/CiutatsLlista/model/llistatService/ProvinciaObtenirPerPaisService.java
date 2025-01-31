package com.jonas.CiutatsLlista.model.llistatService;


import com.jonas.CiutatsLlista.model.Entitats.Provincia;
import com.jonas.CiutatsLlista.model.Repositoris.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProvinciaObtenirPerPaisService {

    @Autowired
    private ProvinciaRepository provinciaRepository;

    public List<Provincia>obtenirProvinciesPerPais(String nomPais){
        List<Provincia>provincies = provinciaRepository.findAll();
        List<Provincia>resultat = new ArrayList<>();

        for (Provincia provincia : provincies){
            if (provincia.getPais().getNom().equalsIgnoreCase(nomPais)){
                resultat.add(provincia);
            }
        }
        return resultat;
    }
}
