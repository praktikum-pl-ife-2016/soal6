public class Wholesaler extends Distributor {

    private double bonus;

    public Wholesaler(String name, String ID, String unit, int harga, int jumlah) {
        super(name, ID, unit, harga, jumlah);
        bonus = 250000 * super.getJumlahTerjual() / 1000;
    }

    public int getTotal() {
        if (super.getJumlahTerjual() > 1000) {
            return super.getTotalPendapatan() + (int) bonus;
        } else {
            return super.getTotalPendapatan();
        }
    }

    public void Tampilans() {
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("ID\t\t: " + getNomorID());
        System.out.println("Unit\t\t: " + getNamaUnit());
        System.out.println("Total Pendapatan: " + getTotal());
    }
}
