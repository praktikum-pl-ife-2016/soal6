package distributor;

public class Distributor {

    private String nama;
    private String nomorID;
    private String namaUnit;
    private int hargaBarang;
    private int jumlahBarang;
    int totalPendapatan;

    public Distributor(String nama, String nomorID, String namaUnit, int jumlahBarang, int hargaBarang) {
        this.nama = nama;
        this.nomorID = nomorID;
        this.namaUnit = namaUnit;
        this.jumlahBarang = jumlahBarang;
        this.hargaBarang = hargaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public int totalPendapatan() {
        return hargaBarang * jumlahBarang;
    }

    public void display() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + nomorID);
        System.out.println("Unit: " + namaUnit);
        System.out.println("Total Pendapatan: " + totalPendapatan());
    }

}
