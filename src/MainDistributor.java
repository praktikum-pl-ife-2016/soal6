
public class MainDistributor {

    public static void main(String[] args) {

        Distributor Owner = new Distributor();
        Owner.setNama("Mahendra");
        Owner.setID("111");
        Owner.setNamaUnit("Distributor");
        Owner.setJumlahTerjual(2000);

        Wholesaler CEO = new Wholesaler();
        CEO.setNama("Syarif");
        CEO.setID("222");
        CEO.setNamaUnit("Wholesaler");
        CEO.setJumlahTerjual(1250);

        Retailer Boss = new Retailer();
        Boss.setNama("Dyara");
        Boss.setID("333");
        Boss.setNamaUnit("Retailer");
        Boss.setJumlahTerjual(350);

        System.out.println("Nama                :" + Owner.getNama());
        System.out.println("ID                  :" + Owner.getID());
        System.out.println("Nama Unit           :" + Owner.getNamaUnit());
        System.out.println("Total Pendapatan    :" + Owner.getTotal());
        System.out.println(" ");

        System.out.println("Nama                :" + CEO.getNama());
        System.out.println("ID                  :" + CEO.getID());
        System.out.println("Nama Unit           :" + CEO.getNamaUnit());
        System.out.println("Total Pendapatan    :" + CEO.getTotal());
        System.out.println(" ");

        System.out.println("Nama                :" + Boss.getNama());
        System.out.println("ID                  :" + Boss.getID());
        System.out.println("Nama Unit           :" + Boss.getNamaUnit());
        System.out.println("Total Pendapatan    :" + Boss.getTotal());
    }
}