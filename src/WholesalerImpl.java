public class WholesalerImpl extends Distributor {
int Discount;

    public WholesalerImpl(String nama, String unit, String nomerID, int jumlahTerjual, int harga) {
        super(nama, unit, nomerID, jumlahTerjual, harga);
    }
   
    public int getDiscount(){
         return (jumlahTerjual /1000)* 250000;
    }
    
    public int gettotalPendapatan() {
        
          int total = super.gettotalPendapatan()+getDiscount();
        
        return total;
    }

    
    }

