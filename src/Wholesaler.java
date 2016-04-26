
public class Wholesaler extends Distributor {

    private int bonus;
    private String nama;
    private String unit;
    private String ID;
    private int harga;
    private int jumlahTerjual;
    private int totalPendapatan;

    @Override
    public void setNama(String n) {
        this.nama = n;
    }

    @Override
    public void setUnit(String n) {
        this.unit = n;
    }

    @Override
    public void setID(String n) {
        this.ID = n;
    }

    @Override
    public void setHarga(int n) {
        this.harga = n;
    }

    @Override
    public void setJual(int n) {
        this.jumlahTerjual = n;
        setDapat(n);
        setBonus(n);
    }

    @Override
    public void setDapat(int n) {
        this.totalPendapatan = n * getHarga();
    }

    public void setBonus(int n) {
        if (n > 1000) {
            this.bonus = 250000 * (n / 1000);
        }
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public String getUnit() {
        return unit;
    }

    @Override
    public int getHarga() {
        return harga;
    }

    @Override
    public int getDapat() {
        return totalPendapatan;
    }

    @Override
    public int getJual() {
        return jumlahTerjual;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public void Display() {
        System.out.println("========================================");
        System.out.println("\tNama\t: " + getNama());
        System.out.println("\tID\t: " + getID());
        System.out.println("\tUnit\t: " + getUnit());
        System.out.println("\tTotal Pendapatan " + (getDapat() + getBonus()));
        System.out.println("========================================");
    }
}
