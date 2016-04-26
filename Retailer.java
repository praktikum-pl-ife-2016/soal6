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
public class Retailer extends Distributor {
    public Retailer(String nama, String ID, String unit, int jumlah, int harga) {
        super(nama, ID, unit, jumlah, harga);
    }
     public int totalPen(){
        return (super.getHarga()*super.getJumlah()) + (super.getHarga()*super.getJumlah())* 5/100;
    }
}
