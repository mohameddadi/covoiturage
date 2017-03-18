package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dadi on 18/03/2017.
 */
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private int nbPlace;
    private String couleur;
    private String categorie;
    private String marque;

    public Long getId() {
        return id;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getMarque() {
        return marque;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
