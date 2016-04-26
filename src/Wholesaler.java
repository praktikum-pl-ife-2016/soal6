package inherietance;

public class Wholesaler extends Distributor {

    int bonus;

    public Wholesaler(String nama, String nomorID, String namaUnit, int jumlahTerjual) {
        super(nama, nomorID, namaUnit, jumlahTerjual);
        bonus = 0;
    }

    public int getBonus() {
        return (jumlahTerjual / 1000) * 250000;
    }

    public int getTotalPendapatan() {
        return (jumlahTerjual * harga) + getBonus();
    }

}
