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
public class Segitiga extends Geometri {
    float alas,tinggi,miring;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

   
    @Override
    double luas(){
        return alas*tinggi/2;
    }
    
     @Override
    double keliling(){
        miring=(alas*alas)+(tinggi*tinggi);
        return alas+tinggi+miring;
    }
}
