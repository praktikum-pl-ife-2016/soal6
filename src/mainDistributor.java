package Soal6Distribusi;
public class mainDistributor {

    public static void main(String[] args) {
        Distribusi a = new Distribusi("Terry", 12345, "Distribusi", 500000, 1500);
        Wholesaler b = new Wholesaler("Ayna", 98765, "Wholesaler", 275000, 2000);
        Retailer c = new Retailer("Siwi", 88990, "Retailer", 45000, 560);

        a.dissplaymessage();
        b.dissplaymessage();
        c.dissplaymessage();
    }
}
