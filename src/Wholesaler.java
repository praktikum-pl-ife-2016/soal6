package maindistributor;
public class Wholesaler extends Distributor {
    int bonus;
    public Wholesaler(String name, String ID, String Unit, int jmlhTerjual) {
        super(name, ID, Unit, jmlhTerjual);
        bonus = 0;
    }
    public int getBonus(){
        return (jumlahTerjual / 1000) * 250000;
    }
    public int getTotalPendapatan(){
        return (jumlahTerjual * harga) + getBonus();
    }
}
