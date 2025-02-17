package com.jonas.CiutatsLlista.model.llistatService;

import com.jonas.CiutatsLlista.model.Entitats.Ciutat;
import com.jonas.CiutatsLlista.model.Repositoris.CiutatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Ciudadservice {
    private CiutatRepository ciutatRepository;
    public Ciudadservice(CiutatRepository ciutatRepository) {this.ciutatRepository = ciutatRepository;}
    public List<Ciutat>getAll(){
        List<Ciutat> ciutats = ciutatRepository.findAll();
        return ciutats;
    }
    public void post(Ciutat ciutat) {
        ciutatRepository.save(ciutat);
    }
}

