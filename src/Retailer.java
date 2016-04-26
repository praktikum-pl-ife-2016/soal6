public class Retailer extends Distributor {
    private int bonus;

    public Retailer(String nama, String noID, String unit, int hargaBrg, int jumlahTerjual) {
        super(nama, noID, unit, hargaBrg, jumlahTerjual);
        bonus=0;
    
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
        bonus = this.getJmlhTerjual() * this.getHargaBrg() * 5 / 100;
    }

    public int getBonus() {
        bonus = (this.getJmlhTerjual() * this.getHargaBrg() * 5 / 100);
        return bonus;
    }

    public int getPendapatan() {
        return super.getPendapatan()+ getBonus();
    }
}