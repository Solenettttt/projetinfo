/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_s2;

/**
 *
 * @author Thuy
 */
public abstract class Revetement {
    int idRevetement;
    public abstract double montant();

    public Revetement(int idRevetement) {
        this.idRevetement = idRevetement;
    }
    
    
}
