package Soal6Distribusi;
public class Retailer extends Distribusi {

    private double diskon;

    public Retailer(String name, int id, String Unit, int harga, int jumlah) {
        super(name, id, Unit, harga, jumlah); //untuk memanggil construktor di class distribusi
        diskon = 0.05 * super.getTotalPendapatan();
    }

    public int getTotal() {
        return super.getTotalPendapatan() + (int) diskon;
    }

    public void dissplaymessage() {
        System.out.println("------------------------------------------");
        System.out.println("Nama                : " + getNama());
        System.out.println("ID                  : " + getNoID());
        System.out.println("Unit                : " + getNamaUnit());
        System.out.println("Total Pendapatan    : " + getTotal());
        System.out.println("------------------------------------------");
    }
}
