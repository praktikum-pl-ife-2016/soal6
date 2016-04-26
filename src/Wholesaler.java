package distributor;

public class Wholesaler extends Distributor {

    private double bonus;

    public Wholesaler(String nama, String id, String unit, int harga, int jumlah, int pendapatan) {
        super(nama, id, unit, harga, jumlah, pendapatan);
        this.bonus = 0;
    }

    public double getBonus() {
        if (getJumlah() >= 1000) {
            this.bonus = super.getHarga() * super.getJumlah() + 250000;
        } else {
            this.bonus = 0;
        }
        return bonus;
    }

    public double getPendapatan() {
        double pendapatan = super.getPendapatan();
        return pendapatan + getBonus();
    }
}
