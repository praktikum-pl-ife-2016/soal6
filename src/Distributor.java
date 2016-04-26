
public class Distributor {

    private String nama, id, unit;
    private int harga, bnyk;
    int total;

    public Distributor(String nama, String id, String unit, int bnyk, int harga) {
        this.nama = nama;
        this.id = id;
        this.unit = unit;
        this.bnyk = bnyk;
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlah() {
        return bnyk;
    }

    public int totalPendapatan() {
        return harga * bnyk;
    }

    public void display() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("ID\t\t: " + id);
        System.out.println("Unit\t\t: " + unit);
        System.out.println("Pendapatan\t: " + totalPendapatan());
    }

}
