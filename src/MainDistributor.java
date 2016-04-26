public class MainDistributor {
    public static void  main(String[]args){
        Distributor people1 = new Distributor("Ninda","Distributor","1234",2000,1500);
        people1.display();
        WholesalerImpl people2= new WholesalerImpl("Rizalfimansyah","Wholesaler","223344",2000,150);
        people2.display();
        Retailer people3 = new Retailer("RedyDardiri","Retailer","234235",2000,3000);
        people3.display();
    }
}
