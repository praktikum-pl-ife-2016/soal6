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
public class Wholesaler extends Distributor {
    int bonus, total, x;

    public Wholesaler(String nama, String ID, String unit, int jumlah, int harga) {
        super(nama, ID, unit, jumlah, harga);
    }



    public int totalPen() {
        if (super.getJumlah() > 1000){
        x = super.getJumlah() / 1000;
        total =  (super.getHarga() * super.getJumlah()) + (250000 * x);}
        return total;
    }
}