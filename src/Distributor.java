
package maindistributor;

public class Distributor {
    public String nama,noID,namaUnit;
    public int harga,jumlah,totalPen;
    
    public Distributor(String nama,String noID,String namaUnit,int harga,int jumlah){
        this.nama=nama;
        this.noID=noID;
        this.namaUnit=namaUnit;
        this.harga=harga;
        this.jumlah=jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public String getNoID() {
        return noID;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getTotalPen() {
        return totalPen=harga*jumlah;
    }
    

    public void tampil(){
        System.out.println("nama     :"+this.getNama());
        System.out.println("no Id    :"+this.getNoID());
        System.out.println("nama Unit:"+this.getNamaUnit());
        System.out.println("total pendapatan :"+this.getTotalPen());
    }
    
}
