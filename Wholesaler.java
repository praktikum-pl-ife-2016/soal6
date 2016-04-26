
package distributor;

public class Wholesaler extends Distributor {
    private int bonus;

    public Wholesaler(String nama, int nomorID, String unit, int hargaBarang, int jumlahTerjual) {
        super(nama, nomorID, unit, hargaBarang, jumlahTerjual);
        
        
    }
    public void setBonus (){
     
        if (jumlahTerjual>1000)
            bonus=(jumlahTerjual/1000)*250;
    else
    bonus=0;
    } 
        public double getBonus (){
     return bonus;       
        
        }
        public void setTotalPendapatan (){
            totalPendapatan = bonus+(hargaBarang*jumlahTerjual);
        
        }
        public int getTotalPendapatan (){
            return totalPendapatan;
        }
    
    }

    

