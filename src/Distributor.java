package distributor;

public class Distributor {

    private String nama, id, unit;
    private int harga, jumlah;
    private double pendapatan;

    public Distributor(String nama, String id, String unit, int harga, int jumlah, double pendapatan) {
        this.nama = nama;
        this.id = id;
        this.unit = unit;
        this.harga = harga;
        this.jumlah = jumlah;
        this.pendapatan = pendapatan;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public String getUnit() {
        return unit;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getPendapatan() {
        return harga * jumlah;
    }

    public void displayMessage() {
        System.out.println("===========================================");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("ID\t\t\t: " + id);
        System.out.println("Unit\t\t\t: " + unit);
        System.out.println("Total Pendapatan\t: " + getPendapatan());
        System.out.println("===========================================");
    }
}
