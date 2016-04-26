/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class distributor {
private  String nama,nomerID,namaUnit;
private  int hargaBarang,jumlahTerjual,totalPendapatan;

public distributor(){
    
}
public distributor(String nama,String nomerID,String namaUnit,int hargaBarang,int jumlahTerjual){
    this.nama=nama;
    this.nomerID=nomerID;
    this.namaUnit=namaUnit;
    this.hargaBarang=hargaBarang;
    this.jumlahTerjual=jumlahTerjual;
}
public String getNama(){
    return nama;
}
public  void setNama(String a){
    nama=a;
}
public  String getNomerID(){
    return nomerID;
}
public  void setNomerID(String a){
    nomerID=a;
}
public  String getNamaUnit(){
    return namaUnit;
}
public  void setNamaUnit(String a){
    namaUnit=a;
}
public  int getHargaBarang(){
    return hargaBarang;
}
public  void setHargaBarang(int a){
    hargaBarang=a;
}
public  int getJumlahTerjual(){
    return jumlahTerjual;
}
public  void setJumlahTerjual(int a){
    jumlahTerjual=a;
}
public  int getTotalPendapatan(){
    return totalPendapatan;
}
public  void setTotalPendapatan(int a){
    totalPendapatan=a;
}
}
