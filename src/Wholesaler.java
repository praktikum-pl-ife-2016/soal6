

public class Wholesaler extends Distributor {

    int bonus;

    public Wholesaler(String nama, String nomorId, String namaUnit, int hargaBarang, int jumlahlTerjual) {
        super(nama, nomorId, namaUnit,hargaBarang , jumlahlTerjual);
        bonus = 0;
    }

    public int getBonus() {
        bonus = (jumlahTerjual / 1000) * 250000;
        return bonus;
    }

    public int getTotalPendapatan() {
        int total = super.getTotalPendapatan() + getBonus();
        return total;
    }
}
