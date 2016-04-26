
public class Retailer extends Distributor {

    private int bonus;

    public Retailer() {
        super();
    }

    public int getBonus() {
        if (jumlahTerjual > 1000) {
            bonus = (int) (super.total * 0.05);
        } else {
            bonus = 0;
        }
        return bonus;
    }

    public int getTotal() {
        int pendapatan = super.getTotal();
        return pendapatan + getBonus();
    }
}
