public class MainDistributor {
    public static void  main(String[]args){
Distributor user = new Distributor("Kris","84344","Distribusi",200,1500);
user.tampilan();
Wholesaler user2 = new Wholesaler("Ayu","23450","Wholesaler",100,2500);
user2.tampilan();
Retailer user3 = new Retailer ("Sinta","76543","Retailer",150,2000);
user3.tampilan();
}
}
