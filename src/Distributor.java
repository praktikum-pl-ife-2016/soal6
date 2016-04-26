package distributor;

public class Distributor {

    public String nama;
    public String nomorID;
    public String namaUnit;
    public int hargaBarang;
    public int jumlahTerjual;
    public int totalPendapatan;

    public Distributor(String nama, String nomorID, String namaUnit, int hargaBarang, int jumlahTerjual) {
        this.nama = nama;
        this.nomorID = nomorID;
        this.namaUnit = namaUnit;
        this.hargaBarang = hargaBarang;
        this.jumlahTerjual = jumlahTerjual;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorID() {
        return nomorID;
    }

    public void setNomorID(String nomorID) {
        this.nomorID = nomorID;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumlahTerjual() {
        return jumlahTerjual;
    }

    public void setJumlahTerjual(int jumlahTerjual) {
        this.jumlahTerjual = jumlahTerjual;
    }

    public int getTotalPendapatan() {
        return hargaBarang * jumlahTerjual;
    }

    public void setTotalPendapatan(int totalPendapatan) {
        this.totalPendapatan = totalPendapatan;
    }
    
    public void displayMessage(Distributor d1){
     System.out.println("Nama    : " + d1.nama);
     System.out.println("No ID   : " + d1.nomorID);
     System.out.println("Unit    : " + d1.namaUnit);
     System.out.println("Total   : " + d1.getTotalPendapatan());
     System.out.println("");
    }
    
}
    
