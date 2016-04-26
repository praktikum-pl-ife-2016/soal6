
public class Distributor {

    private String nama, ID, namaUnit;
    final int hargaBarang;
    int jumlahTerjual, total;

    Distributor() {
        hargaBarang = 5000;

    }

    public void setNama(String x) {
        this.nama = x;
    }

    public void setID(String x) {
        this.ID = x;
    }

    public void setNamaUnit(String x) {
        this.namaUnit = x;
    }

    public void setJumlahTerjual(int x) {
        this.jumlahTerjual = x;
    }

    public String getNama() {
        return this.nama;
    }

    public String getID() {
        return this.ID;
    }

    public String getNamaUnit() {
        return this.namaUnit;
    }

    public int getTotal() {
        return total = jumlahTerjual * hargaBarang;
    }
}
