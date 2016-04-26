
package distributor;

 public class Retailer extends Distributor {
    private int bonus;

    public Retailer(String nama, String nomer, String unit, int harga, int jml) {
        super(nama, nomer, unit, harga, jml);
    }
    
   
    public int getPendapatan(){
        return (super.getPendapatan()+getBonus());
    }
         public int getBonus(){
        bonus = (int) (0.05 * super.getPendapatan());
        return bonus;
    }
 }
    

