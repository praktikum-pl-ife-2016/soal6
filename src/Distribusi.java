package Soal6Distribusi;
public class Distribusi { //class induk

    private String nama;
    private int nomorID;
    private String namaUnit;
    private int hargaBarang;
    private int jumlahTerjual;
    private int totalPendapatan;

    public Distribusi(String name, int id, String Unit, int harga, int jumlah) {
        this.nama = name;
        this.nomorID = id;
        this.namaUnit = Unit;
        this.hargaBarang = harga;
        this.jumlahTerjual = jumlah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNomorID(int nomorID) {
        this.nomorID = nomorID;
    }

    public int getNoID() {
        return nomorID;
    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public void setJumlahTerjual(int jumlahTerjual) {
        this.jumlahTerjual = jumlahTerjual;
    }

    public int getJumlahTerjual() {
        return jumlahTerjual;
    }

    public int getTotalPendapatan() {
        return totalPendapatan = jumlahTerjual * hargaBarang;
    }

    public void dissplaymessage() {
        System.out.println("------------------------------------------");
        System.out.println("Nama                : " + getNama());
        System.out.println("ID                  : " + getNoID());
        System.out.println("Unit                : " + getNamaUnit());
        System.out.println("Total Pendapatan    : " + getTotalPendapatan());
        System.out.println("------------------------------------------");
    }
}
