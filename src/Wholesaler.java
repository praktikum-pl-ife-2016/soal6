package distributor;

public class Wholesaler extends Distributor {

    int totalPendapatan;

    public Wholesaler(String nama, String nomorID, String namaUnit, int jumlahBarang, int hargaBarang) {
        super(nama, nomorID, namaUnit, jumlahBarang, hargaBarang);
    }

    public int totalPendapatan() {
        if (super.getJumlahBarang() > 1000) {
            totalPendapatan = super.getHargaBarang() * super.getJumlahBarang() + 250000;
        }
        return totalPendapatan;
    }
}
