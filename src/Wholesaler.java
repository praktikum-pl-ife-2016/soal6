public class Wholesaler extends Distributor {

    private int bonus;

    public Wholesaler(String nama, String nomorID, String namaUnit, int hargaBarang, int jumlahTerjual) {
        super(nama, nomorID, namaUnit, hargaBarang, jumlahTerjual);
    }

    public int getBonus() {
        if (this.getJumlahTerjual() > 1000) {
            bonus = (int) (this.getJumlahTerjual() / 1000) * 250000;
        }
        return bonus;
    }

    public int getTotalPendapatan() {
        return (super.getTotalPendapatan() + getBonus());
    }
}