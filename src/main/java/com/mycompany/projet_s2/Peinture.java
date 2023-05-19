/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_s2;

/**
 *
 * @author Thuy
 */
public class Peinture extends Revetement {
    
    int idPeinture;
    double prix;
    int cpeinture;

    public Peinture(int idPeinture, double prix, int idRevetement) {
        super(idRevetement);
        this.idPeinture = idPeinture;
        this.prix = prix;
    }
   
    
    
    public double montant (Mur.surface(),prix){
        double montant = Mur.surface() * prix;
        return montant;
    }
  }