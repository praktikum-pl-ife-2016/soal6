public class Retailer extends Distributor {
    private double bonus;
    public double getBonus(){
        bonus = 0.05*super.getTotalPendapatan();
        return bonus;
    }
    public double getTotalPendapatan(){
        return super.getTotalPendapatan()+bonus;
    }
}
