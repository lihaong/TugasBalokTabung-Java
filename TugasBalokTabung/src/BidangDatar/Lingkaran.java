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
public class Lingkaran implements MenghitungBidang {
    public double jari;
    public double tinggi;
    private double luasB, kelilingB;

    public Lingkaran(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public double getLuasB() {
        return luasB;
    }

    public double getKelilingB() {
        return kelilingB;
    }
    
    @Override
    public void luasBidang() {       
        luasB = this.jari * this.jari * 3.14;
    }

    @Override
    public void keliling() {
        kelilingB = 2 * 3.14 * this.jari;
    }
    
}
