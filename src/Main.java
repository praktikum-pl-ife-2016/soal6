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
public class Main {
    public static void main(String[] args) {
        Distributor gambli = new Distributor("dia",1551502,"Distributor",100000,1000);
        Wholesaler ambli = new Wholesaler("lagi dia",1551503,"wholesaler",200000,2000);
        Retailer mbli = new Retailer("dia lagi",1551504,"retailer",300000,3000);
        
        gambli.tampil();
        ambli.tampil();
        mbli.tampil();
    }
}
