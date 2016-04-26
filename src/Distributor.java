

public class Distributor {

    String nama, nomorId, namaUnit;
    int jumlahTerjual, totalPendapatan, hargaBarang;

    public Distributor(String nama, String nomorId, String namaUnit, int hargaBarang, int jumlahTerjual) {
        this.nama = nama;
        this.nomorId = nomorId;
        this.namaUnit = namaUnit;
        this.hargaBarang = hargaBarang;
        this.jumlahTerjual = jumlahTerjual;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorId() {
        return nomorId;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public int getTotalPendapatan() {
        return jumlahTerjual * hargaBarang;
    }

    public void display() {
        System.out.println("============================================");
        System.out.println("Nama\t: " + getNama());
        System.out.println("ID\t: " + getNomorId());
        System.out.println("Unit\t: " + getNamaUnit());
        System.out.println("Total Pendapatan : " + getTotalPendapatan());
        System.out.println("============================================");
    }

}
