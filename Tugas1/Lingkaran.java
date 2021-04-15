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
public class Lingkaran extends Geometri {
    float jari;

    public Lingkaran(float jari) {
        this.jari = jari;
    }
    
    
    @Override
    double luas(){
        return Math.PI*jari*jari;
    }
    
     @Override
    double keliling(){
        return Math.PI*jari*2;
    }
}