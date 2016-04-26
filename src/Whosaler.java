package distributor;

public class Whosaler extends Distributor {
    
    private int bonus;

    public Whosaler(String nama, String nomorID, String namaUnit, int hargaBarang, int jumlahTerjual) {
        super(nama, nomorID, namaUnit, hargaBarang, jumlahTerjual);
        bonus = 0;
    }

    public int getBonus() {
        super.getJumlahTerjual();
        int value = jumlahTerjual / 1000;
        bonus = value * 25000;
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    public int getTotal() {
        int total = (hargaBarang * jumlahTerjual) + getBonus();
        return total;
    }
    
    
}
