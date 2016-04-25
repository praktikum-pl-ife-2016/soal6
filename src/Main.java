public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Distributor user = new Distributor("Ridwan","24312","Distribusi",100,2000);
        user.tampilan();
        Wholesaler user2 = new Wholesaler("Ramdhan","435534","Wholesaler",100,2000);
        user2.tampilan();
        Retailer user3 = new Retailer ("Rosyid","543452","Retailer",100,2000);
        user3.tampilan();
    }
    
}
