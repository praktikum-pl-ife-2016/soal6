public class Retailer extends Distributor {

    private int bonus;

    public Retailer(String nama, String nomorID, String namaUnit, int hargaBarang, int jumlahTerjual) {
        super(nama, nomorID, namaUnit, hargaBarang, jumlahTerjual);

    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
        bonus = this.getJumlahTerjual() * this.getHargaBarang() * 5 / 100;
    }

    public int getBonus() {
        bonus = (this.getJumlahTerjual() * this.getHargaBarang() * 5 / 100);
        return bonus;
    }

    public int getTotalPendapatan() {
        return super.getTotalPendapatan()+ getBonus();
    }
}