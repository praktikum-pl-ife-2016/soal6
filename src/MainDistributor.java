package distributor;

public class MainDistributor {
    public static void main(String[] args) {
        
        Whosaler a1 = new Whosaler("Albert", "007", "Whosaler", 50000, 5000);
        a1.displayMessage(a1);
        
        Distributor a2 = new Distributor("Wunsel", "212", "Distributor", 4000, 2000);
        a2.displayMessage(a2);
        
        Retailer a3 = new Retailer("Charles", "666", "Retailer", 2000, 4000);
        a3.displayMessage(a3);
    }
}
