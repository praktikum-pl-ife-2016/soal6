public class MainDistribusi {

    public static void main(String[] args) {
        
        
        
        Dsitributor boss = new Dsitributor();
        boss.setNama("Madan");
        boss.setNomrId("1234");
        boss.setNamaUnit("Distributor");
        boss.setJlhTerjual(1500);
        
        Wholesaler staff = new Wholesaler();
        staff.setNama("Baim");
        staff.setNomrId("1234");
        staff.setNamaUnit("Wholesaler");
        staff.setJlhTerjual(500);
        
        Retailer babu = new Retailer();
        babu.setNama("Mahendra");
        babu.setNomrId("1234");
        babu.setNamaUnit("Retailer");
        babu.setJlhTerjual(1500);
        
        System.out.println("Nama        : "+boss.getNama());
        System.out.println("Nomor Id    : "+boss.getnomorId());
        System.out.println("Nama Unit   : "+boss.getNamaUnit());
        System.out.println("Pendapatan  : "+boss.getTotalPendapatan());
        System.out.println("=======================================");
        
        System.out.println("Nama        : "+staff.getNama());
        System.out.println("Nomor Id    : "+staff.getnomorId());
        System.out.println("Nama Unit   : "+staff.getNamaUnit());
        System.out.println("Pendapatan  : "+staff.getTotalPendapatan());
        System.out.println("=======================================");
        
        System.out.println("Nama        : "+babu.getNama());
        System.out.println("Nomor Id    : "+babu.getnomorId());
        System.out.println("Nama Unit   : "+babu.getNamaUnit());
        System.out.println("Pendapatan  : "+babu.getTotalPendapatan());
        System.out.println("=======================================");
      
    }
}
