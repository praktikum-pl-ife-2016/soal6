
public class Retailer extends Distributor{
    private int bonus;
    public Retailer(String nama, String nomorID, String namaUnit, int hargaBarang, int jumlahTerjual) {
        super(nama, nomorID, namaUnit, hargaBarang, jumlahTerjual);
        setBonus();
        totalPendapatan();
    }
    public void setBonus() {
        bonus = (int) ((this.getHargaBarang()*this.getJumlahTerjual())* 0.05);
    }
    public double getBonus() {
        return bonus;
    }
    public void totalPendapatan(){
        super.setTotalPendapatan(bonus+(this.getHargaBarang()*this.getJumlahTerjual()));
    }
}
