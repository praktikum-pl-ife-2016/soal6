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
public class MainDi {
     public static void main(String[] args) {
        Distributor objek1 = new Distributor ("Jerry", "7676", "Distributor", 2000, 100);
        objek1.display();
        Wholesaler objek2 = new Wholesaler ("Eko", "8594", "Wholesaler", 2000, 100);
        objek2.display();
        Retailer objek3 = new Retailer ("Widianto", "7856", "Retailer", 2000, 100);
        objek3.display();
}}
