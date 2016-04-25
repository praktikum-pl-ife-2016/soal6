public class MainClass {

    public static void main(String[] args) {
        Distributor d1 = new Distributor("Rega", "1234", "Distributor", 100, 2000);
        d1.displayMessage();
        Wholesaler w1 = new Wholesaler("Diva", "1234", "Wholesaler", 100, 1900);
        w1.displayMessage();
        Retailer r1 = new Retailer("Candra", "1234", "Retailer", 100, 2000);
        r1.displayMessage();
    }

}