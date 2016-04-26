
public class Retailer extends Distributor {
private int Discount;

    public Retailer(String nama, String unit, String nomerID, int jumlahTerjual, int harga) {
        super(nama, unit, nomerID, jumlahTerjual, harga);
        getPendapatan();
    }
 
    public int getDiscount(){
     Discount = (int)(0.05 * super.gettotalPendapatan());
         
    return Discount;
    
    }

    public int getPendapatan(){
        return (super.gettotalPendapatan()+getDiscount());
    }
}
