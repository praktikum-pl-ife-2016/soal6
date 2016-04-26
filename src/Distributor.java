public class Distributor {

    private String nama;
    private String nomorID;
    private String namaUnit;
    private int hargaBarang;
    private int jumlahTerjual;
    private int totalPendapatan;

    public Distributor(String name, String ID, String unit, int harga, int jumlah) {
        nama = name;
        nomorID = ID;
        namaUnit = unit;
        hargaBarang = harga;
        jumlahTerjual = jumlah;
    }

    public void setNama(String name) {
        nama = name;
    }

    public String getNama() {
        return nama;
    }

    public void setNomorID(String ID) {
        nomorID = ID;
    }

    public String getNomorID() {
        return nomorID;
    }

    public void setNamaUnit(String unit) {
        namaUnit = unit;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public void setHargaBarang(int harga) {
        hargaBarang = harga;
    }

    public int getHaragaBarang() {
        return hargaBarang;
    }

    public void setJumlahTerjual(int jumlah) {
        jumlahTerjual = jumlah;
    }

    public int getJumlahTerjual() {
        return jumlahTerjual;
    }

    public int getTotalPendapatan() {
        return totalPendapatan = jumlahTerjual * hargaBarang;
    }

    public void Tampilan() {
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("ID\t\t: " + getNomorID());
        System.out.println("Uni\t\t: " + getNamaUnit());
        System.out.println("Total Pendapatan: " + getTotalPendapatan());
    }
}
