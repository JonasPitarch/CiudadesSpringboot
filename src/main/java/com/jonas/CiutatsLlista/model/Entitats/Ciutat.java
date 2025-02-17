package com.jonas.CiutatsLlista.model.Entitats;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
    @Table (name = "CIUTAT")
    public class Ciutat {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        long id;
        @Column(nullable = false)
        String nom;
        int poblacio;
        String descripcio;
        String imatge;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PROVINCIA")
    @JsonIgnoreProperties("ciutats")
    private Provincia provincia;

        public Ciutat(long id, String nom, int poblacio, String descripcio, String imatge) {
            this.id = id;
            this.nom = nom;
            this.poblacio = poblacio;
            this.descripcio = descripcio;
            this.imatge = imatge;
        }

        public Ciutat() {

        }


        public Long getId() {
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

        public int getPoblacio() {
            return poblacio;
        }

        public void setPoblacio(int poblacio) {
            this.poblacio = poblacio;
        }

        public String getDescripcio() {
            return descripcio;
        }

        public void setDescripcio(String descripcio) {
            this.descripcio = descripcio;
        }

        public String getImatge() {
            return imatge;
        }

        public void setImatge(String imatge) {
            this.imatge = imatge;
        }

        public void setId(Long id) {
            this.id = id;
        }

        @ManyToMany
        @JoinTable(
                name = "PROVINCIA_CIUDAD",
                joinColumns = @JoinColumn(name = "ID_CIUDAD"),
                inverseJoinColumns = @JoinColumn(name = "ID_FRANQUICIA")
        )
        private List<Franquicia> franquicias;



}


