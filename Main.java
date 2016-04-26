/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author efriza
 */
public class Main {

    public static void main(String[] args) {
        Distributor d = new Distributor("Bojan","4321","Distributor",1000,2000);
        System.out.println("==================================================");
        d.tampil();
        Wholesaler w = new Wholesaler("Jeffren", "1234", "Wholesaler", 1000, 2000);
        System.out.println("==================================================");
        w.tampil();
        Retailer r = new Retailer ("Thiago","2413","Retailer",1000,2000);
        System.out.println("==================================================");
        r.tampil();
    }
}
