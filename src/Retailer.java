public class Retailer extends Dsitributor {
private int bonus;
    public Retailer(){
        super();
    }
    public int getBonus(){
        if(jlhTerjual>1000)
            bonus = (int) (super.totalPendapatan*0.05);
        else 
            bonus =0;
        return bonus;
    }
    
    public int getTotalPendapatan(){
        int pendapatan = super.getTotalPendapatan();
        return pendapatan+getBonus();
    }    
}
