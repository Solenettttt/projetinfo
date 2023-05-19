/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projet_s2;

import java.util.ArrayList;

/**
 *
 * @author Thuy
 */
public class Piece {
    public int idPiece;
    public ArrayList<Mur> murs;
    public ArrayList<Ttsurfaces> solplafond;
  
    public Piece(int id){
        this.idPiece = id;
        this.murs = new ArrayList<Mur>();
        this.solplafond = new ArrayList<Ttsurfaces>();

        Mur m1 = new Mur(1);
        murs.add(m1);
        int i = 2;

        try{
            while(i <= 4){
                Mur mur = new Mur(i, murs.get(murs.size()-1).getFin());
                murs.add(mur);
                i++;
            }

            Sol sol = new Sol(murs);
            Plafond plafond = new Plafond(murs);

            this.solplafond.add((Ttsurfaces)sol);
            this.solplafond.add((Ttsurfaces)plafond);
            
            System.out.println("Piece creee");
        }
        catch(RuntimeException e){
            System.out.println("Erreur pendant la creation de votre piece");
        }
    }
    
    
    //methode calcul de surface pour mur
     public double surface(){
        double L1 = 0;
        double L2 = 0;
        /*double X1;
        double Y1;
        double X2;
        double Y2;*/
        L1 = this.murs.get(1).longueur();
        L2 = this.murs.get(2).longueur();
       // X1 = Math.pow(this.murs.get(1).getFin().getX() - this.murs.get(1).getDebut().getX(), 2);
        //Y1 = Math.pow(this.murs.get(1).getFin().getY() + this.murs.get(1).getDebut().getY(), 2);
        //L1 = Math.sqrt(X1-Y1);
        
        //X2 = Math.pow(this.murs.get(2).getFin().getX() - this.murs.get(2).getDebut().getX(), 2);
        //Y2 = Math.pow(this.murs.get(2).getFin().getY() + this.murs.get(2).getDebut().getY(), 2);
        //L1 = Math.sqrt(X2-Y2);
        return L1*L2;
    }
     
     
    //calcul du cout en fonction de suface et revetement determiné
    
   public double calculrevetement(double hsp){
        double res = 0;
        for(Mur mur : murs){ //pour tous les murs
            res += mur.surface(hsp) * mur.revetement.prixUnitaire;
        }
        for(Ttsurfaces s : solplafond){  //calculs pour tous sols et plafonds
            if(s instanceof Sol){   //si c'est un sol
                Sol sol = (Sol) s;
                res += sol.surface(hsp) * sol.revetement.prixUnitaire;
            }
            else if(s instanceof Plafond){//si c'est un plafond
                Plafond plaf = (Plafond) s;
                res += plaf.surface(hsp) * plaf.revetement.prixUnitaire;
            }
        }
        return res;
    }  
    
   
  
}
    

