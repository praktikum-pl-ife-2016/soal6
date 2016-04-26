/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab6;

/**
 *
 * @author JERRY
 */
public class Distributor {
  private String nama, ID, unit;
    private int harga, jumlah;
    int total;
    
    public Distributor(String nama, String ID, String unit, int jumlah, int harga){
        this.nama = nama;
        this.ID = ID;
        this.unit = unit;
        this.jumlah = jumlah;
        this.harga = harga;        
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public void setUnit (String unit){
        this.unit = unit;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public void setJumlah (int jumlah){
        this.jumlah = jumlah;
    }
    public String getNama (){
        return nama;
    }
    public String getID (){
        return ID;
    }
    public String getUnit (){
        return unit;
    }
    public int getHarga (){
        return harga;
    }
    public int getJumlah(){
        return jumlah;
    }
    public int totalPen(){
        return harga*jumlah;
    }
    public void display(){
        System.out.println("Nama : "+nama);
        System.out.println("ID : "+ID);
        System.out.println("Unit : "+unit);
        System.out.println("total pendapatan : "+totalPen());
    }
    }
