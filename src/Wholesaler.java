public class Wholesaler extends Distributor {
    private int bonus;
    public Wholesaler(String nama, String nomorID, String namaunit,int jlhTerjual){
        super(nama,nomorID,namaunit,jlhTerjual);
        
        bonus = 0;
    }
    public void setBonus(){
        this.bonus = bonus;
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
