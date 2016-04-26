package soal6;
public class Retailer extends Distributor {
    private int bonus;
    
    public Retailer(String nama, String ID, String unit, int harga, int jumlah){
        super(nama, ID, unit, harga, jumlah);
    }
    
    public int getBonus(){
        bonus = (int) (0.05 * super.getPendapatan());
        return bonus;
    }
    
    public int getPendapatan(){
        return (super.getPendapatan()+getBonus());
    }
    
}
