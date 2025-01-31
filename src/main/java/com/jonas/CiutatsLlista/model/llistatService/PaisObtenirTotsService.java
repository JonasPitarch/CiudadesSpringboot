package com.jonas.CiutatsLlista.model.llistatService;


import com.jonas.CiutatsLlista.model.Entitats.Pais;
import com.jonas.CiutatsLlista.model.Repositoris.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisObtenirTotsService {
    @Autowired
    private PaisRepository paisRepository;

    public List<Pais>obtenirTotsElsPaisos(){
        return paisRepository.findAll();
    }

    public Optional<Pais>obtenirPaisPerId(Long id){
        return paisRepository.findById(id);
    }
}
