package com.jonas.CiutatsLlista.model.Entitats;

import jakarta.persistence.*;

@Entity
@Table
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long ID;
    @Column(nullable = false)
    String nom;
    @ManyToOne
    @JoinColumn(name = "ID_PAIS", nullable = false)
    private Pais pais;

    public Provincia(){

    }

    public Provincia(long ID, String nom, Pais pais) {
        this.ID = ID;
        this.nom = nom;
        this.pais = pais;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
