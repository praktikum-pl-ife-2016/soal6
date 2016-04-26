package maindistributor;

public class MainDistributor {

    public static void main(String[] args) {
        Distributor distributor = new Distributor("Marsacanita", "11223344", "DISTRIBUTOR", 3000);
        distributor.display(distributor);
        
        Distributor wholesaler = new Wholesaler("Xenovia", "44332211", "WHOLESALER", 2000);
        distributor.display(wholesaler);
       
        Distributor retailer = new Retailer("Sinthaa", "10293847", "RETAILER", 1500);
        distributor.display(retailer);
    }
    
}
