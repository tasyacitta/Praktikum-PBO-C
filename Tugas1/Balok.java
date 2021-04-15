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
public class Balok extends Geometri{
float panjang,lebar,tinggi;

    public Balok(float panjang, float lebar, float tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double luas(){
        return panjang*lebar;
    }
    
     @Override
    double keliling(){
        return 2*(panjang+lebar);
    }
    
     @Override
    double luasPermukaan(){
        return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
    }
     @Override
    double volume(){
        return luas()*tinggi;
    }
}
