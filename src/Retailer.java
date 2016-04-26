package distributor;

public class Retailer extends Distributor {

    public Retailer(String nama, String nomorID, String namaUnit, int jumlahBarang, int hargaBarang) {
        super(nama, nomorID, namaUnit, jumlahBarang, hargaBarang);
    }

    public int totalPendapatan() {
        return (super.getHargaBarang() * super.getJumlahBarang()) + (super.getHargaBarang() * super.getJumlahBarang()) * 5 / 100;
    }

}
