/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunRuang;
import BidangDatar.Lingkaran;
/**
 *
 * @author mfaja
 */
public class Tabung extends Lingkaran implements MenghitungRuang{

    private double volumeR,luasP;

    public double getVolumeR() {
        return volumeR;
    }

    public double getLuasP() {
        return luasP;
    }
    
    public Tabung(double jari, double tinggi) {
        super(jari, tinggi);
    }
    

    @Override
    public void volume() {
        volumeR = 3.14 * jari * jari * tinggi;
    }

    @Override
    public void luasPermukaan() {
        luasP = 2 * 3.14 * jari * ( jari + tinggi );
    }
    
}
