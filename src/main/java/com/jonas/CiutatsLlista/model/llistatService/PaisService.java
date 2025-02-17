package com.jonas.CiutatsLlista.model.llistatService;

import com.jonas.CiutatsLlista.model.Entitats.Ciutat;
import com.jonas.CiutatsLlista.model.Entitats.Pais;
import com.jonas.CiutatsLlista.model.Repositoris.PaisRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaisService {
    private PaisRepository paisRepository;
    public PaisService(PaisRepository paisRepository) {this.paisRepository = paisRepository;}
        public List<Pais> getAll(){
        List<Pais>paiss = paisRepository.findAll();
        return paiss;
    }
}
