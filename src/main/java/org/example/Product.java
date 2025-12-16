package org.example;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

// I. Classe Product
public class Product {
    private int id;
    private String nom;
    private double prix;

    // Constructeur sans paramètre
    public Product() {
    }


    public Product(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    // Redéfinition de toString()
    @Override
    public String toString() {
        return "Product{id=" + id + ", nom='" + nom + "', prix=" + prix + "}";
    }
}