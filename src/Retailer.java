package Bab6;

public class Retailer extends Distributor {

    private int jmlBonus;

    public Retailer(String nama, String id, String namaUnit, int harga, int terjual) {
        super(nama, id, namaUnit, harga, terjual);
    }

    public int hitungBonus() {
        jmlBonus = (int)(0.05 * super.getTotal());
        return super.getTotal() + jmlBonus;
    }
    
    public void DisplayR(){
        System.out.println("Nama : " + super.getNama());
        System.out.println("id : " + super.getId());
        System.out.println("Unit : " + super.getNamaUnit());
        System.out.println("Total Pendapatan : " + this.hitungBonus());
    }
}
