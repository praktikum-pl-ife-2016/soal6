package soal6;
public class Main {
    public static void main(String[] args) {
        Distributor objek1 = new Distributor("Badman","8000","Distribusi",500,40000);
        objek1.displayMessage();
        Wholesaler objek2 = new Wholesaler("Miracle","9000","Wholesaler",500,2000);
        objek2.displayMessage();
        Retailer objek3 = new Retailer("Fear","7000","Retailer",500,4000);
        objek3.displayMessage();
    }
}
