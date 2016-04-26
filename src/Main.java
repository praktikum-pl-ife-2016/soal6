public class Main {
    public static void main(String[] args) {
        //distributor
        Distributor distributor = new Distributor();
        distributor.setNama("Rizki");
        distributor.setNmrID("1234");
        distributor.setNamaUnit("Distributor");
        distributor.setHargaBarang(15000);
        distributor.setJumlahTerjual(1550);
        System.out.println("Nama             : "+distributor.getNama());
        System.out.println("ID               : "+distributor.getNmrID());        
        System.out.println("Unit             : "+distributor.getNamaUnit());       
        System.out.println("Jumlah Terjual   : "+distributor.getJumlahTerjual());       
        System.out.println("Harga barang     : "+distributor.getHargaBarang());       
        System.out.printf("Total pendapatan : %5.2f\n",distributor.getTotalPendapatan()); 
        System.out.println("=================================================");
        //wholesaler
        Wholesaler wholesaler = new Wholesaler();
        wholesaler.setNama("Albert");
        wholesaler.setNmrID("5678");
        wholesaler.setNamaUnit("Wholesaler");
        wholesaler.setHargaBarang(15000);
        wholesaler.setJumlahTerjual(1550);
        System.out.println("Nama             : "+wholesaler.getNama());
        System.out.println("ID               : "+wholesaler.getNmrID());        
        System.out.println("Unit             : "+wholesaler.getNamaUnit());       
        System.out.println("Jumlah Terjual   : "+wholesaler.getJumlahTerjual());       
        System.out.println("Harga barang     : "+wholesaler.getHargaBarang());  
        System.out.println("Bonus            : "+wholesaler.getBonus());
        System.out.printf("Total pendapatan : %.2f\n",wholesaler.getTotalPendapatan());
        System.out.println("=================================================");
        //retailer
        Retailer retailer = new Retailer();
        retailer.setNama("Luthfi");
        retailer.setNmrID("2121");
        retailer.setNamaUnit("Retailer");
        retailer.setHargaBarang(15000);
        retailer.setJumlahTerjual(1550);
        System.out.println("Nama             : "+retailer.getNama());
        System.out.println("ID               : "+retailer.getNmrID());        
        System.out.println("Unit             : "+retailer.getNamaUnit());       
        System.out.println("Jumlah Terjual   : "+retailer.getJumlahTerjual());       
        System.out.println("Harga barang     : "+retailer.getHargaBarang());  
        System.out.printf("Bonus            : %.2f\n",retailer.getBonus());
        System.out.printf("Total pendapatan : %.2f\n",retailer.getTotalPendapatan());     
    }
}
