package maindistributor;

public class Wholesaler extends Distributor {

    private int bonus;

    public Wholesaler(String nama, String noID, String namaUnit, int harga, int jumlah) {
        super(nama, noID, namaUnit, harga, jumlah);
    }
    public int Bonus(){
        return bonus=(((super.getJumlah()/1000)*250000)+ +getTotalPen());
    }
    public void Tampil2(){
        System.out.println("nama      :"+super.getNama());
        System.out.println("no ID     :"+super.getNoID());
        System.out.println("nama unit :"+super.getNamaUnit());
        System.out.println("total pendapatan :"+Bonus());
    }

}
