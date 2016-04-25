/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal;

/**
 *
 * @author AcerAsp4750
 */
public class Distributor {
    private String nama;
    private int id;
    private String unit;
    private double pendapatan;
    private double harga;
    private double jumlah;
    
    public Distributor(){
        
    }
    public Distributor(String n, int i, String u, double h,double j){
        this.nama=n;
        this.id=i;
        this.unit=u;
        this.harga=h;
        this.jumlah=j;
    }
     public void setNama(String nama){
        this.nama = nama;
    }
    public void setID(int id){
        this.id= id;
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
    public String getName(){
        return nama;
    }
    public int getId(){
        return id;
    }
    public String getUnit(){
        return unit;
    }
    public double getHarga(){
        return harga;
    }
    public double getJumlah(){
        return jumlah;
    }
    public double totalPendapatan(){
        return jumlah * harga;
    }
    public void DisplayMessage(){
        System.out.println("=================================================");
        System.out.println("Nama             : "+nama);
        System.out.println("ID               : "+id);
        System.out.println("Unit             : "+unit);
        System.out.println("Total Pendapatan : "+totalPendapatan());
    }
    
}
