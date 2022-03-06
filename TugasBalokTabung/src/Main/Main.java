/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;
import BangunRuang.Tabung;
import BangunRuang.Balok;

/**
 *
 * @author mfaja
 */
public class Main {
    static void hitung(double panjang, double lebar, double tinggi, double jari, int opsi){
        if(opsi == 1){
            Tabung tb = new Tabung(jari,tinggi);
            tb.luasPermukaan();
            tb.volume();
            tb.luasBidang();
            tb.keliling();
            System.out.println("Luas Persegi Panjang = " + tb.getLuasB());
            System.out.println("Keliling Persegi Panjang = " + tb.getKelilingB());
            System.out.println("Volume Balok = " + tb.getVolumeR());
            System.out.println("Luas Permukaan Balok = " + tb.getLuasP());
        }else{
            Balok bl = new Balok(panjang,lebar,tinggi);
            bl.luasPermukaan();
            bl.volume();
            bl.luasBidang();
            bl.keliling();
            System.out.println("Luas Lingkaran = " + bl.getLuasB());
            System.out.println("Keliling Lingkaran = " + bl.getKelilingB());
            System.out.println("Volume Tabung = " + bl.getVolumeR());
            System.out.println("Luas Permukaan  = " + bl.getLuasP());
        }
    }
    
    static void menuUtama(){
        Scanner myOpsi = new Scanner(System.in);
        int opsiMenu;
        double tempPanjang = 0;
        double tempLebar = 0;
        double tempTinggi = 0;
        double tempJari = 0;
        do{
            System.out.println("\n+-------------------------+");
            System.out.println("|         Main Menu       |");
            System.out.println("+-------------------------+");
            System.out.println("1. Hitung Tabung");
            System.out.println("2. Hitung Balok");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            opsiMenu = myOpsi.nextInt();
            switch(opsiMenu){
                case 1:
                    System.out.print("\nInput Jari - jari = ");
                    tempJari = myOpsi.nextDouble();
                    System.out.print("Input Tinggi = ");
                    tempTinggi = myOpsi.nextDouble();
                    hitung(tempPanjang, tempLebar, tempTinggi, tempJari, opsiMenu);
                    break;
                case 2:
                    System.out.print("\nInput Panjang = ");
                    tempPanjang = myOpsi.nextDouble();
                    System.out.print("Input Lebar = ");
                    tempLebar = myOpsi.nextDouble();
                    System.out.print("Input Tinggi = ");
                    tempTinggi = myOpsi.nextDouble();
                    hitung(tempPanjang, tempLebar, tempTinggi, tempJari, opsiMenu);
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
        }while(opsiMenu != 0);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menuUtama();
    }
    
}
