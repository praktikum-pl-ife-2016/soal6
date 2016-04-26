package distributor;

public class MainDistributor {

    public static void main(String[] args) {
        Distributor d = new Distributor("Affan", "155150201111085", "Distributor", 8000, 1000, 10000);
        d.displayMessage();
        Wholesaler w = new Wholesaler("Rizky", "155040101111075", "Wholesaler", 5000, 800, 5000);
        w.displayMessage();
        Retailer r = new Retailer("Rusdi", "155040201111088", "Retailer", 8000, 1000, 8000);
        r.displayMessage();
    }
}
