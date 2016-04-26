public class Retailer extends Distributor {

    private double bonus;
    private double total;
    
    
    public int getBonus() {
        bonus = (0.05 * super.getPendapatan());
        return (int) bonus;
    }

    public double getTotal() {
        total = super.getPendapatan();
        return total + getBonus();
    }
}
