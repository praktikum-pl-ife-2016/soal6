
package distributor;

public class MainDistributor {
    public static void main(String[] args) {
        Distributor obj1 = new Distributor ("Peitra", "7274427", "Distributor", 3000, 100000);
        obj1.display();
        Wholesaler obj2 = new Wholesaler ("Erdi", "7683953", "Wholesaler", 10000, 100000);
        obj2.display();
        Retailer obj3 = new Retailer ("Rinjani", "87349478", "Retailer", 10000, 100000);
        obj3.display();
}
}

