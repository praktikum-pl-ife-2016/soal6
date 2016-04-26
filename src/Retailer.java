public class Retailer extends Distributor{
    private int bonus;
    public Retailer(String nama, String nomorID, String namaunit,int jlhTerjual){
        super(nama,nomorID,namaunit,jlhTerjual);
    }
    public void setBonus(){
        this.bonus = bonus;
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
