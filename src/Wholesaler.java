
package distributor;

    public class Wholesaler extends Distributor {
    private int bonus;

    public Wholesaler(String nama, String nomer, String unit, int harga, int jml) {
        super(nama, nomer, unit, harga, jml);
    }
    
    public int getBonus(){
        int value = super.getJumlah()/1000;
        if (value>0) {
            bonus = value*250000;
        }
        return bonus;
    }
    public int getPendapatan(){
        return (super.getPendapatan()+getBonus());
    }
    
}
    

