    public class Retailer extends Distributor {
    private double bonus; 
    public Retailer(String nama, String id, String unit, double harga, double terjual) {
        super(nama, id, unit, harga, terjual);     
    }

     public int getBonus() {
        bonus = (0.05 * super.getPendapatan());
        return (int) bonus;
    }

    public double getPendapatan() {
        double baseTotal = super.getPendapatan();
        return baseTotal + getBonus();
    }
}

