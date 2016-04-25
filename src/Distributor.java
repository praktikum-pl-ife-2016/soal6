public class Distributor {
    private String nama;
    private String nomorID;
    private String namaUnit;
    private int hargaBarang;
    private int jumlahTerjual;
    private int totalPendapatan;

    public Distributor(String nama, String nomorID, String namaUnit, int hargaBarang, int jumlahTerjual) {
        this.nama = nama;
        this.nomorID = nomorID;
        this.namaUnit = namaUnit;
        this.hargaBarang = hargaBarang;
        this.jumlahTerjual = jumlahTerjual;
        setTotalPendapatan(jumlahTerjual*hargaBarang);
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setNomorID(String nomorID){
        this.nomorID=nomorID;
    }
    public void setNamaUnit (String namaUnit){
        this.namaUnit=namaUnit;
    }
    public void setHargaBarang(int hargaBarang){
        this.hargaBarang=hargaBarang;
    }
    public void setJumlahTerjual(int jumlahTerjual){
        this.jumlahTerjual=jumlahTerjual;
    }
    
    public String getNama() {
        return nama;
    }

    public String getNomorID() {
        return nomorID;
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public int getJumlahTerjual() {
        return jumlahTerjual;
    }
    
    public void setTotalPendapatan(int totalPendapatan){
        this.totalPendapatan = totalPendapatan;
    }
    public int getTotalPendapatan() {
        return totalPendapatan;
    }
}
