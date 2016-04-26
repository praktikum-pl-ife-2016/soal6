
public class Wholesaler extends Distributor {

    private int bonus;

    public Wholesaler(String nama, String nomorID, String namaUnit, int hargaBarang, int jumlahBarang) {
        super(nama, nomorID, namaUnit, hargaBarang, jumlahBarang);
        bonus = 0;
    }

    public void setBonus(int Bonus) {
        this.bonus = Bonus;

    }

    public int getBonus() {
        super.getJumlahTerjual();
        int kelipatan = jumlahTerjual / 1000;
        bonus = kelipatan * 250000;
        return bonus;
    }

    public int getTotalPendapatan() {
        int total = (hargaBarang * jumlahTerjual) + getBonus();
        return total;
    }

}
