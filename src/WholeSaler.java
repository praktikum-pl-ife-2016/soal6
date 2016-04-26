public class WholeSaler extends Distributor {
    private int bonus;

    public WholeSaler(String nama, String noID, String unit, int hargaBrg, int jumlahTerjual) {
        super(nama, noID, unit, hargaBrg, jumlahTerjual);
    }
    
    public int getBonus(){
        int jum = super.getJmlhTerjual()/1000;
        if (jum>0) {
            bonus = jum*250000;
        }
        return bonus;
    }
    public int getPendapatan(){
        return (super.getPendapatan()+getBonus());
    }
    
}