package com.jonas.CiutatsLlista.model.llistatService;

import com.jonas.CiutatsLlista.model.Entitats.Provincia;
import com.jonas.CiutatsLlista.model.Repositoris.ProvinciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvinciaService {
    private ProvinciaRepository provinciaRepository;
    public ProvinciaService (ProvinciaRepository provinciaRepository){this.provinciaRepository = provinciaRepository;}
    public List<Provincia> getAll(){
        List<Provincia> provincias = provinciaRepository.findAll();
        return provincias;
    }
}
