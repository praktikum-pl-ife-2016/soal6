
public class MainDistributor {
    public static void main(String[] args){
        Distributor dis = new Distributor();
        dis.setNama("Muhammad Baqir");
        dis.setID("1412");
        dis.setUnit("Distributor");
        dis.setHarga(100000);
        dis.setJual(2000);
        dis.Display();
        Wholesaler wsl = new Wholesaler();
        wsl.setNama("Deni Fianda");
        wsl.setID("1379");
        wsl.setUnit("Wholesaler");
        wsl.setHarga(100000);
        wsl.setJual(1500);
        wsl.Display();
        Retailer rtl = new Retailer();
        rtl.setNama("Haryo P.");
        rtl.setID("1678");
        rtl.setUnit("Retailer");
        rtl.setHarga(100000);
        rtl.setJual(3000);
        rtl.Display();
    }
    
}
