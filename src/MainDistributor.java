
package distributor;

public class MainDistributor {
   
    public static void main(String[] args) {
        
        Distributor konsumen = new Distributor("Amelia Dwi","270298","Retailer",100,2000);
        konsumen.displayMessage();
        Wholesaler konsumen2 = new Wholesaler("Ninda Silvia","1960745","Wholesaler",100,2000);
        konsumen2.displayMessage();
        Retailer konsumen3 = new Retailer ("Haryuni","6859603","Distributor",100,2000);
        konsumen3.displayMessage();
    }
    
}
    

