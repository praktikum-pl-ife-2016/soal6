public class mainClass {

    public static void main(String[] args) {
        Distributor dis = new Distributor();
        Wholesaler who = new Wholesaler();
        Retailer ret = new Retailer();
        
        //Distributor
        dis.setNama("Wunsel Arto Negoro");
        dis.setId("155150201111089");
        dis.setUnit("Distributor");
        dis.setHargabarang(50000);
        dis.setTerjual(1500);
        dis.getPendapatan();
        
        System.out.println("Nama \t\t : "+dis.getNama());
        System.out.println("ID \t\t : "+dis.getId());
        System.out.println("Unit \t\t : "+dis.getUnit());
        System.out.println("Total Pendapatan : "+dis.getPendapatan());
        System.out.println("===========================================");
      
        //Wholesaler
        who.setNama("Charles S");
        who.setId("155150201111000");
        who.setUnit("Wholsaler");
        who.setHargabarang(5000);
        who.setTerjual(1500);
        who.getPendapatan();
        
        System.out.println("Nama \t\t : "+who.getNama());
        System.out.println("ID \t\t : "+who.getId());
        System.out.println("Unit \t\t : "+who.getUnit());
        System.out.println("Total Pendapatan : "+who.getTotal());
        System.out.println("===========================================");
        
        //Retailer
        ret.setNama("Chalif");
        ret.setId("155150201111001");
        ret.setUnit("Retailer");
        ret.setHargabarang(50000);
        ret.setTerjual(1500);
        ret.getPendapatan();
        
        System.out.println("Nama \t\t : "+ret.getNama());
        System.out.println("ID \t\t : "+ret.getId());
        System.out.println("Unit \t\t : "+ret.getUnit());
        System.out.println("Total Pendapatan : "+(int)ret.getTotal());
        
    }
}
