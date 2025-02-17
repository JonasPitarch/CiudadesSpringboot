package com.jonas.CiutatsLlista.model.Repositoris;

import com.jonas.CiutatsLlista.model.Entitats.Ciutat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CiutatRepository extends JpaRepository<Ciutat, Long> {

}
