

public class Wholesaler extends Distributor {

    int bonus;

    public Wholesaler(String nama, String nmrId, String nmaUnit, int jmlTerjual) {
        super(nama, nmrId, nmaUnit, jmlTerjual);
        bonus = 0;
    }

    public int getBonus() {
        bonus = (jumlahTerjual / 1000) * 250000;
        return bonus;
    }

    public int getTotalPendapatan() {
        int total = (jumlahTerjual * hargaBarang) + getBonus();
        return total;
    }
}
