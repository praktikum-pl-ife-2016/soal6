public class MainDistributor {
    public static void main(String[] args) {
        Distributor m1 = new Distributor("Luth", "12345","Distributor", 10,5000);
        Wholesaler m2 = new Wholesaler("Wuns", "12345","Wholesaler", 10,5000);
        Retailer m3 = new Retailer("Gans", "12345","Retailer", 10,5000);
        System.out.println("Nama  : " + m1.getNama());
        System.out.println(" ID   : " + m1.getId());
        System.out.println("Unit  : " + m1.getUnit());
        System.out.println("Total : " +m1.getPendapatan());
        System.out.println("============================");
        System.out.println("Nama  : " + m2.getNama());
        System.out.println(" ID   : " + m2.getId());
        System.out.println("Unit  : " + m2.getUnit());
        System.out.println("Total : " +m2.getBonus());
        System.out.println("============================");
        System.out.println("Nama  : " + m3.getNama());
        System.out.println(" ID   : " + m3.getId());
        System.out.println("Unit  : " + m3.getUnit());
        System.out.println("Total : " +m3.getPendapatan());
        
    }
    
}
