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
public class Retailer extends Distributor {
    private double diskon;
    
    public Retailer(String nama, int id, String NamaUnit, int HargaBarang, int JumlahTerjual){
    super( nama,  id,  NamaUnit, HargaBarang, JumlahTerjual);
    diskon =super.getTotalPendapatan()*0.05;
    }
    
    public int TotalPendapatan(){
    return super.getTotalPendapatan()+ (int)diskon;
    }
    
    public void tampil(){
        System.out.println("nama                : "+getNama());
        System.out.println("ID                  : "+getId());
        System.out.println("unit                : "+getNamaUnit());
        System.out.println("Total Pendapatan    : "+TotalPendapatan());
    }
}
