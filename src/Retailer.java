public class Retailer extends Distributor {

    private double bonus;

    public Retailer(String name, String ID, String unit, int harga, int jumlah) {
        super(name, ID, unit, harga, jumlah);
        bonus = 0.05 * super.getHaragaBarang();
    }

    public int getTotals() {
        return super.getTotalPendapatan() + (int) bonus;
    }

    public void Tampilann() {
        System.out.println("Nama\t\t: " + getNama());
        System.out.println("ID\t\t: " + getNomorID());
        System.out.println("Unit\t\t: " + getNamaUnit());
        System.out.println("Total Pendapatan: " + getTotals());
    }
}
