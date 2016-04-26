package Soal6Distribusi;
public class Wholesaler extends Distribusi {
    private double bonus;

    public Wholesaler(String name, int id, String Unit, int harga, int jumlah) {
        super(name, id, Unit, harga, jumlah); //untuk memanggil construktor di class distribusi
        bonus = (250000 * super.getJumlahTerjual() / 1000);

    }

    public int getTotalSemua() {
        if (super.getJumlahTerjual() >= 1000) {
            return super.getTotalPendapatan() + (int) bonus;
        } else {
            return super.getTotalPendapatan();
        }

    }

    public void dissplaymessage() {
        System.out.println("------------------------------------------");
        System.out.println("Nama                : " + getNama());
        System.out.println("ID                  : " + getNoID());
        System.out.println("Unit                : " + getNamaUnit());
        System.out.println("Total Pendapatan    : " + getTotalSemua());
        System.out.println("------------------------------------------");
    }
}
