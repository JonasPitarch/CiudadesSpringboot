package com.jonas.CiutatsLlista.model.Entitats;

import jakarta.persistence.*;

@Entity
@Table
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long ID;
    @Column(nullable = false)
    String Nom;

    public Pais(){

    }
    public Pais(long ID, String nom) {
        this.ID = ID;
        Nom = nom;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
}
