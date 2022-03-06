/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BidangDatar;

/**
 *
 * @author mfaja
 */
public class PersegiPanjang implements MenghitungBidang{
    public double panjang;
    public double lebar;
    public double tinggi;
    private double kelilingB,luasB;

    public PersegiPanjang(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double getKelilingB() {
        return kelilingB;
    }

    public double getLuasB() {
        return luasB;
    }

    @Override
    public void luasBidang() {
        luasB = this.panjang * this.lebar;
    }

    @Override
    public void keliling() {
        kelilingB = 2 * ( this.panjang + this.lebar);
    }
    
    
}
