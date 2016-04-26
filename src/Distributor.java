/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum6;

/**
 *
 * @author Guest
 */
public class Distributor {
    private String nama, NamaUnit;
    private int id, HargaBarang, JumlahTerjual, TotalPendapatan;

    Distributor(String nama, int id, String NamaUnit, int HargaBarang, int JumlahTerjual){
    this.nama = nama;
    this.id=id;
    this.NamaUnit=NamaUnit;
    this.HargaBarang=HargaBarang;
    this.JumlahTerjual=JumlahTerjual;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNamaUnit() {
        return NamaUnit;
    }

    public void setNamaUnit(String NamaUnit) {
        this.NamaUnit = NamaUnit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHargaBarang() {
        return HargaBarang;
    }

    public void setHargaBarang(int HargaBarang) {
        this.HargaBarang = HargaBarang;
    }

    public int getJumlahTerjual() {
        return JumlahTerjual;
    }

    public void setJumlahTerjual(int JumlahTerjual) {
        this.JumlahTerjual = JumlahTerjual;
    }

    public int getTotalPendapatan() {
        TotalPendapatan = HargaBarang*JumlahTerjual;
        return TotalPendapatan;
    }

    public void tampil(){
        System.out.println("nama                : "+getNama());
        System.out.println("ID                  : "+getId());
        System.out.println("unit                : "+getNamaUnit());
        System.out.println("Total Pendapatan    : "+getTotalPendapatan());
    }
    
    
    
   
    
}
