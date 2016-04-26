package inherietance;

public class Retailer extends Distributor {

    double diskon;

    public Retailer(String nama, String nomorID, String namaUnit, int jumlahTerjual) {
        super(nama, nomorID, namaUnit, jumlahTerjual);
        diskon = 0;
    }

    public double getDiskon() {
        return (jumlahTerjual * super.harga) * 0.05;
    }

    public int getTotalPendapatan() {
        double total = (jumlahTerjual * harga) + getDiskon();
        return (int) total;
    }

}
