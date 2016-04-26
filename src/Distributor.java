package soal6;
public class Distributor {
    private String nama;
    private String ID;
    private String unit;
    private int jumlah;
    private int harga;
    private int totalPendapatan;
    
    public Distributor(String nama, String ID, String unit, int harga, int jumlah){
        this.nama = nama;
        this.ID = ID;
        this.unit = unit;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public String getID() {
        return ID;
    }

    public String getUnit() {
        return unit;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    public int getPendapatan(){
        totalPendapatan = harga * jumlah;
        return totalPendapatan;
    }
    
    public void displayMessage(){
        System.out.println("========================");
        System.out.println("Nama : "+ nama +".");
        System.out.println("ID : "+ ID);
        System.out.println("Unit : "+ unit);
        System.out.println("Total Pendapatan : "+ getPendapatan());
        System.out.println("========================");
    }

}
