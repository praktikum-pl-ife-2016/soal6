


    
    public class Retailer extends Distributor {
    private int diskon;

    public Retailer(String nama, int nomorID, String unit, int hargaBarang, int jumlahTerjual) {
        super(nama, nomorID, unit, hargaBarang, jumlahTerjual);
        
        
    }
    public void setDiskon (){
     diskon = (int) (hargaBarang*jumlahTerjual*0.05);
        
    } 
        public double getDiskon (){
     return diskon;       
        
        }
        public void setTotalPendapatan (){
            totalPendapatan = diskon+(hargaBarang*jumlahTerjual);
        
        }
        public int getTotalPendapatan (){
            return totalPendapatan;
        }
    
    }
    

