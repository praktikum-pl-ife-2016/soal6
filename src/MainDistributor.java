public class MainDistributor {
  public static void main(String[] args) {
         Distributor db = new Distributor ("Irfan", "1551520", "Distributor", 500000, 1200);
         Wholesaler wl = new Wholesaler ("Reva", "207111", "Wholesaler", 350000, 100);
         Retailer rt = new Retailer ("Fijar", "9991012", "Retailer", 40000, 150);
         System.out.println("===================================");
         System.out.println("Nama       : "+ db.getNama());
         System.out.println("ID         : "+ db.getID());
         System.out.println("Unit       : "+ db.getNama());
         System.out.println("Pendapatan : "+ db.getPendapatan());
         System.out.println("===================================");
         System.out.println("Nama       : "+ wl.getNama());
         System.out.println("ID         : "+ wl.getID());
         System.out.println("Unit       : "+ wl.getNama());
         System.out.println("Pendapatan : "+ wl.getPendapatan());
         System.out.println("====================================");
         System.out.println("Nama       : "+ rt.getNama());
         System.out.println("ID         : "+ rt.getID());
         System.out.println("Unit       : "+ rt.getNama());
         System.out.println("Pendapatan : "+ rt.getPendapatan());
         
     }
 }
   