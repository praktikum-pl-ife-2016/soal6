



public class Distributor {
    private String nama, Unit, id;
    private int  Harga, Terjual, TotalPendapatan;

    Distributor(String nama, String id, String Unit, int Harga, int Terjual){
    this.nama = nama;
    this.id=id;
    this.Unit=Unit;
    this.Harga=Harga;
    this.Terjual=Terjual;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public int getTerjual() {
        return Terjual;
    }

    public void setTerjual(int Terjual) {
        this.Terjual = Terjual;
    }

    public int getTotalPendapatan() {
        TotalPendapatan = Harga*Terjual;
        return TotalPendapatan;
    }

    public void display(){
        System.out.println("nama\t\t\t: "+getNama());
        System.out.println("ID\t\t\t: "+getId());
        System.out.println("unit\t\t\t: "+getUnit());
        System.out.println("Total Pendapatan\t: "+getTotalPendapatan());
    }
    
    
    
   
    
}
