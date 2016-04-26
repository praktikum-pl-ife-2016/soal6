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
public class Wholesaler extends Distributor{
    private int bonus;
    
    public Wholesaler(String nama, int id, String NamaUnit, int HargaBarang, int JumlahTerjual){
    super( nama, id,  NamaUnit, HargaBarang, JumlahTerjual);
    bonus = 0;
    }
    
    public int totalPendapatan(){
    
    if(super.getJumlahTerjual()>=1000){
        return super.getTotalPendapatan()+(250000*super.getJumlahTerjual()/1000);
    }else{
        return super.getTotalPendapatan();
        }
    }
    
    public void tampil(){
        System.out.println("nama                : "+getNama());
        System.out.println("ID                  : "+getId());
        System.out.println("unit                : "+getNamaUnit());
        System.out.println("Total Pendapatan    : "+ totalPendapatan());
    }
}
