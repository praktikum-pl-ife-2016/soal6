public class Main {
    public static void main(String[] args) {
        
        Wholesaler grosir = new Wholesaler ("Rudi",1234,"Wholesaler",10000,2000);
        grosir.setBonus();
        grosir.setTotalPendapatan();
        
        Retailer eceran = new Retailer ("Steve",1232,"Retailer",5000,1000);
        eceran.setDiskon();
        eceran.setTotalPendapatan();
        
        Distributor agen = new Distributor ("Darma",1122,"Distributor",4000,5000);
        agen.setTotalPendapatan();
        
        System.out.println("===============================================");
        System.out.println ("Nama             : "+grosir.getNama());
        System.out.println ("ID               : "+grosir.getNomorID());
        System.out.println ("Unit             : "+grosir.getUnit());
        System.out.println ("Total Pendapatan : "+grosir.getTotalPendapatan());
        System.out.println("===============================================");
        
        System.out.println("===============================================");
        System.out.println ("Nama             : "+eceran.getNama());
        System.out.println ("ID               : "+eceran.getNomorID());
        System.out.println ("Unit             : "+eceran.getUnit());
        System.out.println ("Total Pendapatan : "+eceran.getTotalPendapatan());
        System.out.println("===============================================");
        
        System.out.println("===============================================");
        System.out.println ("Nama             : "+agen.getNama());
        System.out.println ("ID               : "+agen.getNomorID());
        System.out.println ("Unit             : "+agen.getUnit());
        System.out.println ("Total Pendapatan : "+agen.getTotalPendapatan());
        System.out.println("===============================================");
        
    }
    
}
