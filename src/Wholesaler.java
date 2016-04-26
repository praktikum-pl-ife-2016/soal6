public class Wholesaler extends Dsitributor {
    private int bonus;
    public Wholesaler(){
        super();
    }
    public int getBonus(){
        int y = jlhTerjual/1000;
        bonus = y*250000;
        return bonus;
    }
    public int getTotalPendapatan(){
        int pendapatan = super.getTotalPendapatan();
        return pendapatan+getBonus();
    }
}
