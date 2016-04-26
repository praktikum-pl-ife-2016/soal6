package Bab6;

public class Distributor {

    private String nama, id, namaUnit;
    private int harga, jumlahTerjual, totalPendapatan;

    public Distributor(String nama, String id, String namaUnit, int harga, int terjual) {
        this.nama = nama;
        this.id = id;
        this.namaUnit = namaUnit;
        this.harga = harga;
        this.jumlahTerjual = terjual;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setTerjual(int terjual) {
        this.jumlahTerjual = terjual;
    }

    public void setTotal(int total) {
        this.totalPendapatan = total;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public int getHarga() {
        return harga;
    }

    public int getTerjual() {
        return jumlahTerjual;
    }

    public int getTotal() {
        return totalPendapatan = harga * jumlahTerjual;
    }
    
    public void DisplayD(){
        System.out.println("Nama : " + this.getNama());
        System.out.println("id : " + this.getId());
        System.out.println("Unit : " + this.getNamaUnit());
        System.out.println("Total Pendapatan : " + this.getTotal());
    }
}
