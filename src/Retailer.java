
public class Retailer extends Distributor {

    public Retailer(String nama, String id, String unit, int jumlah, int harga) {
        super(nama, id, unit, jumlah, harga);
    }

    public int totalPendapatan() {
        return (super.getHarga() * super.getJumlah()) + (super.getHarga() * super.getJumlah()) * 5 / 100;
    }

}
