
public class Distributor {

    public String nama, nomorID, namaUnit;
    public int hargaBarang, jumlahTerjual, totalPendapatan;

    public Distributor(String nama, String nomorID, String namaUnit, int hargaBarang, int jumlahTerjual) {
        this.nama = nama;
        this.nomorID = nomorID;
        this.namaUnit = namaUnit;
        this.hargaBarang = hargaBarang;
        this.jumlahTerjual = jumlahTerjual;

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNomorID(String nomorID) {
        this.nomorID = nomorID;
    }

    public String getNomorID() {
        return nomorID;
    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public void setJumlahTerjual(int jumlahTerjual) {
        this.jumlahTerjual = jumlahTerjual;
    }

    public int getJumlahTerjual() {
        return jumlahTerjual;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setTotalPendapatan(int totalPendapatan) {
        this.totalPendapatan = totalPendapatan;
    }

    public int getTotalPendapatan() {
        return hargaBarang * jumlahTerjual;
    }

}
