package inherietance;

public class Distributor {

    String nama, nomorID, namaUnit;
    int jumlahTerjual, totalPendapatan;
    final int harga = 5000;

    public Distributor(String nama, String nomorID, String namaUnit, int jumlahTerjual) {
        this.nama = nama;
        this.nomorID = nomorID;
        this.namaUnit = namaUnit;
        this.jumlahTerjual = jumlahTerjual;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorID() {
        return this.nomorID;
    }

    public void setNomorID(String nomorID) {
        this.nomorID = nomorID;
    }

    public String getNamaUnit() {
        return this.namaUnit;
    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public int getTotalPendapatan() {
        return jumlahTerjual * harga;
    }

    public void display(Distributor d) {
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("Nama             : " + d.nama);
        System.out.println("Nomor ID         : " + d.nomorID);
        System.out.println("Nama Unit        : " + d.namaUnit);
        System.out.println("Total Pendapatan : " + d.getTotalPendapatan());
        System.out.println("===============================================");

    }

}
