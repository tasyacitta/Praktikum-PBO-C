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
public class Silinder extends Geometri {
    float jari,tinggi;
    double selimut;

    public Silinder(float jari, float tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
   
     @Override
    double luas(){
        return Math.PI*jari*jari;
    }
    
     @Override
    double keliling(){
        return Math.PI*jari*2;
    }
    
     @Override
    double luasPermukaan(){
        selimut=2*Math.PI*jari*tinggi;
        return 2*luas()+selimut;
    }
     @Override
    double volume(){
        return luas()*tinggi;
    }
}
