
public class Wholesaler extends Distributor {
    private int bonus;
    public Wholesaler(String nama, String nomorID, String namaUnit, int hargaBarang, int jumlahTerjual) {
        super(nama, nomorID, namaUnit, hargaBarang, jumlahTerjual);
        setBonus();
        totalPendapatan();
    }
    public void setBonus() {
        if (this.getJumlahTerjual()>1000){
            bonus = ((int)this.getJumlahTerjual()/1000)*250000;
        } else
            bonus=0;
    }
    public int getBonus() {
        return bonus;
    }
    public void totalPendapatan(){
        super.setTotalPendapatan(bonus + (this.getHargaBarang()*this.getJumlahTerjual()));
    }
   

}
