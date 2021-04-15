/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author User
 */
public class Kubus extends Geometri {
    float sisi;

    public Kubus(float sisi) {
        this.sisi = sisi;
    }

   
    @Override
    double luas(){
        return sisi*sisi;
    }
    
     @Override
    double keliling(){
        return 4*sisi;
    }
    
     @Override
    double luasPermukaan(){
        return 6*sisi*sisi;
    }
     @Override
    double volume(){
        return sisi*sisi*sisi;
    }
}