public class Wholesaler extends Distributor {
private double bonus;    

    public Wholesaler(String nama, String id, String unit, double harga, double terjual) {
        super(nama, id, unit, harga, terjual);
        bonus = 250000;
    }

    public double getBonus() {
        double baseTotal = super.getPendapatan();
        return baseTotal + bonus;
    }
}
