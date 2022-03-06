/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunRuang;
import BidangDatar.PersegiPanjang;
/**
 *
 * @author mfaja
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double volumeR, luasP;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar, tinggi);
    }
    
    

    public double getVolumeR() {
        return volumeR;
    }

    public double getLuasP() {
        return luasP;
    }
    
    @Override
    public void volume() {
        volumeR = tinggi * lebar * panjang;
    }

    @Override
    public void luasPermukaan() {
        luasP = 2*(panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    
}
