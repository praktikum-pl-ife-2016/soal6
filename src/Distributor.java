package distributor;

public class Distributor {

    private String nama;
    private String nomer;
    private String unit;
    private int harga;
    private int jumlah;
    private int totalPendapatan;

    public Distributor(String nama, String nomer, String unit, int harga, int jml) {
        this.nama = nama;
        this.nomer = nomer;
        this.unit = unit;
        this.harga = harga;
        this.jumlah = jml;
    }

    public int getPendapatan() {
        totalPendapatan = harga * jumlah;
        return totalPendapatan;
    }

    public String getUnit() {
        return unit;
    }

    public String getNama() {
        return nama;
    }

    public String getNomer() {
        return nomer;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void displayMessage() {
        System.out.println("-----------------------------------");
        System.out.println("Nama             : " + nama);
        System.out.println("ID               : " + nomer);
        System.out.println("Unit             : " + unit);
        System.out.println("Total pendapatan : " + getPendapatan());
        System.out.println("-----------------------------------");
    }
}
