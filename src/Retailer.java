
public class Retailer extends Distributor {

    private double diskon;

    public Retailer(String nama, String nomorID, String namaUnit, int hargaBarang, int jumlahTerjual) {
        super(nama, nomorID, namaUnit, hargaBarang, jumlahTerjual);
        diskon = 0;
    }

    public void setDiskon(double Diskon) {
        this.diskon = diskon;
    }

    public double getDiskon() {
        super.getJumlahTerjual();
        diskon = 0.05 * (jumlahTerjual * hargaBarang);
        return diskon;
    }

    public int getTotalPendapatan() {
        double total = (int) ((jumlahTerjual * hargaBarang) + getDiskon());
        return (int) total;
    }

}
