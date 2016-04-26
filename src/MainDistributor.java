

public class MainDistributor {

    public static void main(String[] args) {

        Distributor person1 = new Distributor("Mahardika", "15515", "DISTRIBUTOR", 1000, 1000);
        person1.display();
        
        Distributor person2 = new Wholesaler("Yuristyawan", "02001", "WHOLESALER",1000, 1500);
        person2.display();
       
        Distributor person3 = new Retailer("Putra", "11060", "RETAILER",1000, 2000);
        person3.display();
    }
}
