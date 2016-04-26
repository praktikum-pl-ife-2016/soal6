package distributor;

public class Retailer extends Distributor {

    private double diskon;

    public Retailer(String nama, String id, String unit, int harga, int jumlah, int pendapatan) {
        super(nama, id, unit, harga, jumlah, pendapatan);
        this.diskon = 0;
    }

    public double getDiskon() {
        return diskon = (5 / 100) * super.getHarga() * super.getJumlah();
    }

    public double getPendapatan() {
        double pendapatan = super.getPendapatan();
        return pendapatan + getDiskon();
    }
}
