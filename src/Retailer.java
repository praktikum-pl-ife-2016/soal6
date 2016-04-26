public class Retailer extends Distributor {

    public Retailer(String nama, String ID, String unit, int jumlah, int harga) {
        super(nama, ID, unit, jumlah, harga);
    }
    
    public int totalPen(){
        return (super.getHarga()*super.getJumlah()) + (super.getHarga()*super.getJumlah())* 5/100;
    }
    
}
