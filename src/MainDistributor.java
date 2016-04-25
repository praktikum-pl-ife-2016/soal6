public class MainDistributor {
    public static void main(String[] args) {
        Distributor distributor = new Distributor ("Atmaja", "23098512", "Distributor", 800000, 100);
        Wholesaler wholesaler = new Wholesaler ("Rasio", "234512", "Wholesaler", 150000, 1500);
        Retailer retailer = new Retailer ("Ganang", "2312", "Retailer", 200000, 15);
        System.out.println("-----------------------------------");
        System.out.println("Nama       : "+ distributor.getNama());
        System.out.println("ID         : "+ distributor.getNomorID());
        System.out.println("Unit       : "+ distributor.getNamaUnit());
        System.out.println("Pendapatan : "+ distributor.getTotalPendapatan());
        System.out.println("-----------------------------------");
        System.out.println("Nama       : "+ wholesaler.getNama());
        System.out.println("ID         : "+ wholesaler.getNomorID());
        System.out.println("Unit       : "+ wholesaler.getNamaUnit());
        System.out.println("Pendapatan : "+ wholesaler.getTotalPendapatan());
        System.out.println("-----------------------------------");
        System.out.println("Nama       : "+ retailer.getNama());
        System.out.println("ID         : "+ retailer.getNomorID());
        System.out.println("Unit       : "+ retailer.getNamaUnit());
        System.out.println("Pendapatan : "+ retailer.getTotalPendapatan());
        
    }
}
