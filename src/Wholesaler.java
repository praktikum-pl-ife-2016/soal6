package Bab6;

public class Wholesaler extends Distributor {

    private int bonus;

    public Wholesaler(String nama, String id, String namaUnit, int harga, int terjual) {
        super(nama, id, namaUnit, harga, terjual);
    }

    public int hitungBonus() {
        return bonus = ((super.getTerjual() / 1000) * 250000) + +getTotal();
    }

    public void DisplayW() {
        System.out.println("Nama : " + super.getNama());
        System.out.println("id : " + super.getId());
        System.out.println("Unit : " + super.getNamaUnit());
        System.out.println("Total Pendapatan : " + hitungBonus());
    }
}
