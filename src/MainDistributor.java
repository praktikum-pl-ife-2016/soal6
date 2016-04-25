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
public class MainDistributor {
    public static void main(String[] args) {
        
       Wholesaler m1 = new Wholesaler("Reza", "1234","Wholesaler",25000, 2000);
       m1.showDisplay(m1);
       Distributor m2 = new Distributor("Andi", "4567", "Distributor", 1500, 1000);
       m2.showDisplay(m2);
       Retailer m3 = new Retailer("Budi", "2626", "Retailer", 1000, 3000);
       m3.showDisplay(m3);
       
    }
    
}
