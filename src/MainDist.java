public class MainDist {
       public static void main(String[] args) {

        Distributor a = new Distributor("Haryuni","250797","Distribusi",100,2000);
        a.display();
        WholeSaler a2 = new WholeSaler("Lita","235687","Wholesaler",100,3000);
        a2.display();
        Retailer a3 = new Retailer ("Amel","123456","Retailer",100,4000);
        a3.display();
    }   
}
