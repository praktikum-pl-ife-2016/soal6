package maindistributor;
public class Distributor {
    String nama, id, unit;
    int jumlahTerjual, totalPendapatan;
    final int harga = 5000;
    
    public Distributor(String name, String ID, String Unit, int jmlhTerjual){
        this.nama = name;
        this.id = ID;
        this.unit = Unit;
        this.jumlahTerjual = jmlhTerjual;
    }
    
    public void setNama(String n){
        this.nama = n;
    }
    
    public void setID(String i){
        this.id = i;
    }
    
    public void setUnit(String u){
        this.unit = u;
    }
    
    public void setJumlahTerjual(int jmlTerjual){
        this.jumlahTerjual = jmlTerjual;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getID(){
        return this.id;
    }
    
    public String getUnit(){
        return this.unit;
    }
    
    public int getTotalPendapatan(){
        return jumlahTerjual * harga;
    }
    public void display(Distributor a){
        System.out.println("============================================");
        System.out.println("Nama : " + a.nama);
        System.out.println("ID   : " + a.id);
        System.out.println("Unit : " + a.unit);
        System.out.println("Total Pendapatan : " + a.getTotalPendapatan());
        System.out.println("============================================");
        System.out.println("============================================");
        
    }
    
}
