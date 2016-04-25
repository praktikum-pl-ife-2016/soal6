public class Distributor {

    private String nama;
    private String nomorID;
    private String namaUnit;
    private int hargaBarang;
    private int jumlahTerjual;
    private int totalPendapatan;

    public Distributor() {
    }

    public Distributor(String nama, String nomorID, String namaUnit, int hargaBarang, int jumlahTerjual) {
        this.nama = nama;
        this.nomorID = nomorID;
        this.namaUnit = namaUnit;
        this.hargaBarang = hargaBarang;
        this.jumlahTerjual = jumlahTerjual;
        this.totalPendapatan = totalPendapatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorID() {
        return nomorID;
    }

    public void setNomorID(String nomorID) {
        this.nomorID = nomorID;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahTerjual() {
        return jumlahTerjual;
    }

    public void setJumlahTerjual(int jumlahTerjual) {
        this.jumlahTerjual = jumlahTerjual;
    }

    public int getTotalPendapatan() {
        totalPendapatan = this.getJumlahTerjual() * this.getHargaBarang();
        return totalPendapatan;
    }

    public void displayMessage() {
        System.out.println("=======================================");
        System.out.println("  Nama \t\t\t: " + getNama());
        System.out.println("  ID \t\t\t: " + getNomorID());
        System.out.println("  Unit \t\t\t: " + getNamaUnit());
        System.out.println("  Total Pendapatan \t: " + getTotalPendapatan());
        System.out.println("=======================================");

    }
}
