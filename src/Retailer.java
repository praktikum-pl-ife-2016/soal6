
public class Retailer extends Distributor {
    double diskon;
    
     public Retailer(String nama, String nmrId, String nmaUnit, int jmlTerjual) {
        super(nama, nmrId, nmaUnit, jmlTerjual);
        diskon = 0;
    }
     
     public double getDiskon() {
        diskon = (jumlahTerjual * super.hargaBarang) * 0.05;
        return diskon;
    }

    public int getTotalPendapatan() {
        double total = (jumlahTerjual * hargaBarang) + getDiskon();
        return (int) total;
    }
     
}
