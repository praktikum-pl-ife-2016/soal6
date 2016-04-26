public class Main {
    public static void main(String[] args) {
        Distributor objek1 = new Distributor ("Kelvin", "1234", "Distributor", 2000, 100);
        objek1.display();
        Wholesaler objek2 = new Wholesaler ("fikri", "4321", "Wholesaler", 2000, 100);
        objek2.display();
        Retailer objek3 = new Retailer ("Kevin", "2143", "Retailer", 2000, 100);
        objek3.display();
}
}
