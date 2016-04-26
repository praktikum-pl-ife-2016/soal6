package soal6;
public class Wholesaler extends Distributor {
    private int bonus;
    
    public Wholesaler(String nama, String ID, String unit, int harga, int jumlah){
        super(nama, ID, unit, harga, jumlah);
    }
    
    public int getBonus(){
        int value = super.getJumlah()/1000;
        if(value > 0){
            bonus = value * 250000;
        }
        return bonus;
    }
    
    public int getPendapatan(){
        return (super.getPendapatan()+getBonus());
    }
}
