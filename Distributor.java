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
public class Distributor {
     private String nama, id, unit;
    private int harga, jumlah;

    public Distributor(String nama, String id, String unit, int harga, int jumlah) {
        this.nama = nama;
        this.unit = unit;
        this.id = id;
        this.harga = harga;
        this.jumlah = jumlah;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getPendapatan() {
        return harga * jumlah;
    }
public void tampil(){
        System.out.println("Nama : "+getNama());
        System.out.println("ID   : "+getId());
        System.out.println("Unit : "+getUnit());
        System.out.println("Total pendapatan : "+getPendapatan());
    }

}
