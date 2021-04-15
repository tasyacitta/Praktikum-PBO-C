/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Persegi extends Geometri {
    float sisi;

   

    Persegi(float sisi) {
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
}
