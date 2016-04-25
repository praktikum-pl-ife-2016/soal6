

public class MainDistributor {

    public static void main(String[] args) {

        Distributor person1 = new Distributor("ADI", "12345", "DISTRIBUTOR", 1500);
        person1.display(person1);
        
        Distributor person2 = new Wholesaler("KURNIAWAN", "112233", "WHOLESALER", 2000);
        person1.display(person2);
       
        Distributor person3 = new Retailer("KURNIA", "678899", "RETAILER", 1000);
        person1.display(person3);
    }
}
