
package Bab6;

public class MainSeller {
    public static void main(String[] args){
    
        Distributor seller = new Distributor("najib", "0001", "Distributor", 15000, 1000);
        Wholesaler seller2 = new Wholesaler("Rijal", "1001", "Wholesaler", 1500, 1000);
        Retailer seller3 = new Retailer("Aldi", "2001", "Retailer", 15000, 1000);
        
        seller.DisplayD();
        System.out.println("----------------------------");
        seller2.DisplayW();
        System.out.println("----------------------------");
        seller3.DisplayR();
    }
}
