public class MainDistributor {
    public static void main(String[] args) {
        Distributor dis = new Distributor ("Kevin", "155150201111078", "Distributor", 5000, 1000);
        dis.display();
        Wholesaler who = new Wholesaler ("Romero", "155150201111077", "Wholesaler", 10000, 10000);
        who.display();
        Retailer ret = new Retailer ("Auramila", "155150201111076", "Retailer", 10000, 10000);
        ret.display();
}
}
