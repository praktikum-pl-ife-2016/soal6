public class Wholesaler extends Distributor {
    private int bonus, total;

    public int getBonus() {
        bonus = (super.getTerjual() / 1000 ) * 250000;
        return bonus;
    }

    public int getTotal() {
        total = getBonus() + super.getPendapatan();
        return total;
    }
}
