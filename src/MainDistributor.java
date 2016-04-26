public class MainDistributor {
    
     public static void main(String[] args) {
        
         Distributor d1 = new Distributor("Baim", "001", "Distributor", 2000);
         System.out.println("====================================");
         System.out.println("Nama : " + d1.getNama());
         System.out.println("Id   : " + d1.getnomorId());
         System.out.println("Unit :" + d1.getNamaUnit());
         System.out.println("Total Pendapatan : " + d1.getTotalPendapatan());
         System.out.println("====================================");
 
         System.out.println("====================================");
         Wholesaler w1 = new Wholesaler("Ecchimadan", "007", "Wholesaler", 1900);
         System.out.println("Nama : " + w1.getNama());
         System.out.println("Id   : " + w1.getnomorId());
         System.out.println("Unit : " + w1.getNamaUnit());
         System.out.println("Total Pendapatan : " + w1.getTotalPendapatan());
         System.out.println("====================================");
 
         System.out.println("====================================");
         Retailer r1 = new Retailer("Saifulah", "002", "Retailer", 1200);
         System.out.println("Nama : " + r1.getNama());
         System.out.println("Id   : " + r1.getnomorId());
         System.out.println("Unit : " + r1.getNamaUnit());
         System.out.println("Total Pendapatan : " + r1.getTotalPendapatan());
         System.out.println("====================================");
    }
    
}
