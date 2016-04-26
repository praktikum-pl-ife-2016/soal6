
public class Distributor {

    private String nama;
    private String unit;
    private String ID;
    private int harga;
    private int jumlahTerjual;
    private int totalPendapatan;

    public void setNama(String n) {
        this.nama = n;
    }

    public void setUnit(String n) {
        this.unit = n;
    }

    public void setID(String n) {
        this.ID = n;
    }

    public void setHarga(int n) {
        this.harga = n;
    }

    public void setJual(int n) {
        this.jumlahTerjual = n;
        setDapat(n);
    }

    public void setDapat(int n) {
        this.totalPendapatan = n * getHarga();
    }

    public String getNama() {
        return nama;
    }

    public String getID() {
        return ID;
    }

    public String getUnit() {
        return unit;
    }

    public int getHarga() {
        return harga;
    }

    public int getDapat() {
        return totalPendapatan;
    }

    public int getJual() {
        return jumlahTerjual;
    }

    public void Display() {
        System.out.println("========================================");
        System.out.println("\tNama\t: " + getNama());
        System.out.println("\tID\t: " + getID());
        System.out.println("\tUnit\t: " + getUnit());
        System.out.println("\tTotal Pendapatan " + getDapat());
        System.out.println("========================================");
    }

}
