/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author efriza
 */
public class Retailer extends Distributor {

    int bonus;

    public Retailer(String nama, String id, String unit, int harga, int jumlah) {
        super(nama, id, unit, harga, jumlah);
        bonus = super.getPendapatan() * 5 / 100;
    }

    public int getPendapatan() {
        return super.getPendapatan() + bonus;
    }

    public void tampil() {
        System.out.println("Nama : " + getNama());
        System.out.println("ID   : " + getId());
        System.out.println("Unit : " + getUnit());
        System.out.println("Total pendapatan : " + super.getPendapatan());
        System.out.println("Total Bonus      : " + bonus);
        System.out.println("Total pendapatan+bonus : " + getPendapatan());
    }

}
