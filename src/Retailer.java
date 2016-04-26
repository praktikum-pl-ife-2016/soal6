
public class Retailer extends Distributor {
    double diskon;
    
     public Retailer(String nama, String nomorId, String namaUnit, int hargaBarang, int jumlahlTerjual) {
        super(nama, nomorId, namaUnit, hargaBarang, jumlahlTerjual);
        diskon = 0;
    }
     
     public double getDiskon() {
        diskon = (jumlahTerjual * super.hargaBarang) * 0.05;
        return diskon;
    }

    public int getTotalPendapatan() {
        double total = super.getTotalPendapatan() + getDiskon();
        return (int) total;
    }
     
}
