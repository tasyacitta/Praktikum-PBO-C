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
public class Main {
    public static void main(String[] args) {
     String ulg = "y";
     boolean check;
     float sisi,panjang,lebar,tinggi,jari,alas;
        do
        {check=false;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Menu Bangun Geometri");
    System.out.println("1. Persegi");
    System.out.println("2. Lingkaran");
    System.out.println("3. Persegi Panjang");
    System.out.println("4. Segitiga Siku-Siku");
    System.out.println("5. Kubus");
    System.out.println("6. Silinder");
    System.out.println("7. Balok");
    System.out.println("0. Keluar");
 
        
    System.out.print("Pilih: ");
    int pilih = input.nextInt();
    try{
    switch(pilih){
        case 0:{System.exit(0);}
        case 1:
        case 2:{
            System.out.print("Masukkan jari-jari: ");
            jari= input.nextFloat();
            Lingkaran ling= new Lingkaran(jari);
            System.out.println("Luas Lingkaran " + ling.luas());
            System.out.println("Keliling Lingkaran " + ling.keliling());

            break;
        }
        case 3:{
            System.out.print("Masukkan panjang: ");
            panjang = input.nextFloat();
            System.out.print("Masukkan lebar: ");
            lebar = input.nextFloat();
            PersegiPanjang pp = new PersegiPanjang(panjang,lebar);
            System.out.println("Luas Persegi Panjang " + pp.luas());
            System.out.println("Keliling Persegi Panjang " + pp.keliling());

            break;
        }
        case 4:{
            System.out.print("Masukkan Alas: ");
            alas= input.nextFloat();
            System.out.print("Masukkan Tinggi: ");
            tinggi = input.nextFloat();
            Segitiga tiga = new Segitiga(alas,tinggi);
            System.out.println("Luas Segitiga Siku-Siku " + tiga.luas());
            System.out.println("Keliling Persegi Panjang " + tiga.keliling());

            break;
        }
        case 5:{
            System.out.print("Masukkan sisi: ");
            sisi = input.nextFloat();
            Kubus kbs = new Kubus (sisi);
            System.out.println("Luas Persegi " + kbs.luas());
            System.out.println("Keliling Persegi " + kbs.keliling());
            System.out.println("Luas Permukaan Kubus " + kbs.luasPermukaan());
            System.out.println("Volume Kubus " + kbs.volume());

            break;
        }
        case 6:{
            System.out.print("Masukkan Jari-jari: ");
            jari = input.nextFloat();
            System.out.print("Masukkan Tinggi: ");
            tinggi = input.nextFloat();
            Silinder silinder = new Silinder(jari,tinggi);
            System.out.println("Luas Alas Silinder " + silinder.luas());
            System.out.println("Keliling Alas Silinder " + silinder.keliling());
            System.out.println("Luas Permukaan Silinder " + silinder.luasPermukaan());
            System.out.println("Volume Silinder " + silinder.volume());

            break;
        }
        case 7:{
            System.out.print("Masukkan panjang: ");
            panjang = input.nextFloat();
            System.out.print("Masukkan lebar: ");
            lebar = input.nextFloat();
            System.out.print("Masukkan tinggi: ");
            tinggi = input.nextFloat();
            Balok balok = new Balok(panjang,lebar, tinggi);
            System.out.println("Luas Alas Balok " + balok.luas());
            System.out.println("Keliling Alas Balok " + balok.keliling());
            System.out.println("Luas Permukaan Balok " + balok.luasPermukaan());
            System.out.println("Volume Balok " + balok.volume());
            break;
        }
        default:
        System.out.println("Input Salah");
    }
    System.out.print("Apakah anda ingin mengulang (y/t)? ");
    } catch (Exception e) {
            System.out.println("Input Salah, silahkan coba lagi.\n");
            check=true;
            }
    ulg = input.next();
    } while (check||ulg.equals("y"));
    }
}
