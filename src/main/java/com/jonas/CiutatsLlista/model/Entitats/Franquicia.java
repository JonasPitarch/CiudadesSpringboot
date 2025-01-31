package com.jonas.CiutatsLlista.model.Entitats;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Franquicia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(nullable = false)
    String nom;

    public Franquicia(){}

    public Franquicia(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @ManyToMany(mappedBy = "franquicias")
    private List<Ciutat> ciudades;
}

