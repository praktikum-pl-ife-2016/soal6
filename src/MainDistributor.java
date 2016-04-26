package inherietance;

public class MainDistributor {

    public static void main(String[] args) {
        Distributor distributor = new Distributor("Riska Andriani", "1772938009", "DISTRIBUTOR", 4000);
        distributor.display(distributor);

        Distributor Wholesaler = new Wholesaler("Rizqi Zidny", "4550399076", "WHOLESALER", 2500);
        distributor.display(Wholesaler);

        Distributor retailer = new Retailer("Adinda Layli", "3229087645", "RETAILER", 1500);
        distributor.display(retailer);
    }

}
