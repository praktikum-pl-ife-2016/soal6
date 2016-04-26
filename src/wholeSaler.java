/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class wholeSaler extends distributor {
    int bonus=250000;
    public wholeSaler(){
    super();
    }
    
    public wholeSaler(String nama,String nomerID,String namaUnit,int hargaBarang,int jumlahTerjual){
        super(nama,nomerID,namaUnit,hargaBarang,jumlahTerjual);
    }
  
    public void show(){
        if(super.getJumlahTerjual()/1000==0)
        super.setTotalPendapatan(super.getJumlahTerjual()*super.getHargaBarang());
    
        else
            super.setTotalPendapatan(super.getJumlahTerjual()*super.getHargaBarang()+super.getJumlahTerjual()/1000*bonus);
        
        System.out.println("Nama :"+super.getNama()+"\nNomerID:"+super.getNomerID()+"\nUnit:"+super.getNamaUnit()+"\nTotal pendapatan:"+super.getTotalPendapatan());
}
}