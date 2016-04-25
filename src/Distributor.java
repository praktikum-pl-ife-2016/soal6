/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributor;

/**
 *
 * @author Rezananda
 */
public class Distributor {

public String nama;
public String nomorID;
public String namaUnit;
public int hargaBarang;
public int jumlahTerjual;
public int totalPendapatan;

public Distributor(String nm, String noId, String nmUnit, int hrgBr, int jmlTrj){
    this.nama = nm;
    this.nomorID = noId;
    this.namaUnit = nmUnit;
    this.hargaBarang = hrgBr;
    this.jumlahTerjual = jmlTrj;
    
   
}

public void setNama(String nm){
    this.nama = nm;
}
public String getNama(){
    return nama;
}
public void setNomerID(String noId){
    this.nomorID = noId;
}
public String getNomerID(){
    return nomorID;
}
public void setNamaUnit(String nmUnit){
    this.namaUnit = nmUnit;
}
public String getNamaUnit(){
    return namaUnit;
}
public void setJumlahBarang(int jml){
    this.jumlahTerjual = jml;
}
public int getJumlahBarang(){
    return jumlahTerjual;
}
public void setHargaBarang(int hrgBrg){
    this.hargaBarang = hrgBrg;
}
public int getHargaBarang(){
    return hargaBarang; 
}
public void setTotal(int tot){
    this.totalPendapatan = tot;
}
public int getTotal(){
    return hargaBarang * jumlahTerjual;
}

public void showDisplay(Distributor x){
    System.out.println("Nama    : " + x.nama);
    System.out.println("No ID   : " + x.nomorID);
    System.out.println("Unit    : " + x.namaUnit);
    System.out.println("Total   : " + x.getTotal());
    System.out.println("");
    
}


}
