
public class Wholesaler extends Distributor {

    int totalWho;

    public Wholesaler(String nama, String id, String unit, int jumlah, int harga) {
        super(nama, id, unit, jumlah, harga);
    }

    public int totalPendapatan() {
        if (super.getJumlah() > 1000) {
            totalWho = super.getHarga() * super.getJumlah() + 250000;
        }
        return totalWho;
    }
}
