public class Wholesaler extends Distributor{
private int bonus;
     public Wholesaler(String nama, String id, String unit, int barang, int jual) {
         super(nama, id, unit, barang, jual);
         setBonus();
         totalPendapatan();
     }
     public void setBonus() {
         if (this.getJual()>1000){
             bonus = ((int)this.getJual()/1000)*250000;
         } else
             bonus=0;
     }
     public int getBonus() {
         return bonus;
     }
     public void totalPendapatan(){
         super.setPendapatan(bonus + (this.getBarang()*this.getJual()));
     }
}
