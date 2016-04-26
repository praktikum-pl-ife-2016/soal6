
public class Wholesaler extends Distributor {

    private int bonus;

    public Wholesaler() {
        super();
    }

    public int getBonus() {
        int y = jumlahTerjual / 1000;
        bonus = y * 250000;
        return bonus;
    }

    public int getTotal() {
        int pendapatan = super.getTotal();
        return pendapatan + getBonus();
    }
}
