

public class Distributor {

    String nama, nomorId, namaUnit;
    int jumlahTerjual, totalPendapatan;
    final int hargaBarang = 5000;

    public Distributor(String nama, String nmrId, String nmaUnit, int jmlTerjual){
        this.nama = nama;
        this.nomorId = nmrId;
        this.namaUnit = nmaUnit;
        this.jumlahTerjual = jmlTerjual;
    }
    
    public void setNama(String name) {
        this.nama = name;
    }

    public void setNomorId(String nomor) {
        this.nomorId = nomor;
    }

    public void setNamaUnit(String nameUnit) {
        this.namaUnit = nameUnit;
    }

    public void setJumlahTerjual(int jumlah) {
        this.jumlahTerjual = jumlah;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNomorId() {
        return this.nomorId;
    }

    public String getNamaUnit() {
        return this.namaUnit;
    }

    public int getTotalPendapatan() {
       return jumlahTerjual * hargaBarang;
    }
    
    public void display(Distributor A){
        System.out.println("============================================");
        System.out.println("Nama : " + A.nama);
        System.out.println("ID   : " + A.nomorId);
        System.out.println("Unit : " + A.namaUnit);
        System.out.println("Total Pendapatan : " + A.getTotalPendapatan());
        System.out.println("============================================");
        System.out.println("============================================");
        
    }

}