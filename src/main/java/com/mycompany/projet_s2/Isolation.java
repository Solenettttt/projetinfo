/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_s2;

/**
 *
 * @author Thuy
 */
public class Isolation extends Revetement{
    int idIsolation;
    double prix;

    public Isolation(int idIsolation, double prix, int idRevetement) {
        super(idRevetement);
        this.idIsolation = idIsolation;
        this.prix = prix;
    }
    
    public double montant (Mur.surface(),prix){
        double montant = Mur.surface() * prix;
        return montant;
    }
}

