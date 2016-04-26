

package maindistributor;

public class Retailer extends Distributor{
private int jmlbonus;
    public Retailer(String nama, String noID, String namaUnit, int harga, int jumlah) {
        super(nama, noID, namaUnit, harga, jumlah);
    }
    public int hitungBonus(){
        jmlbonus=(int)(0.05*super.getTotalPen());
        return super.getTotalPen()+jmlbonus;
        
    }
    public void Tampil(){
        System.out.println("nama      :"+super.getNama());
        System.out.println("no ID     :"+super.getNoID());
        System.out.println("nama unit :"+super.getNamaUnit());
        System.out.println("total pendapatan :"+hitungBonus());
    }
    
}
