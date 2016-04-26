public class Retailer extends Distributor{
private int bonus;
    public Retailer(String nama, String id, String unit, int harga, int jual) {
         super(nama, id, unit, harga, jual);
         setBonus();
         totalPendapatan();
     }
     public void setBonus() {
         bonus = (int) ((this.getHarga()*this.getJual())* 0.05);
     }
     public double getBonus() {
         return bonus;
     }
     public void totalPendapatan(){
         super.setPendapatan(bonus+(this.getBarang()*this.getJual()));
     }
 }