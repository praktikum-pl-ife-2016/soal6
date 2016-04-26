public class Distributor {
    private String nama, nmrID, namaUnit;
    private int hargaBarang, jumlahTerjual, totalPendapatan;
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNmrID(String nmrID) {
        this.nmrID = nmrID;
    }
    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }
    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
    public String getNama() {
        return nama;
    }
    public String getNmrID() {
        return nmrID;
    }
    public String getNamaUnit() {
        return namaUnit;
    }
    public int getHargaBarang() {
        return hargaBarang;
    }
    public int getJumlahTerjual() {
        return jumlahTerjual;
    }
    public void setJumlahTerjual(int jumlahTerjual) {
        this.jumlahTerjual = jumlahTerjual;
    }
    public double getTotalPendapatan() {
        return jumlahTerjual*hargaBarang;
    }   
}
