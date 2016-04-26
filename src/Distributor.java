
public class Distributor {
    private String nama;
    private String unit;
    private String nomerID;
    int jumlahTerjual ;
    private int harga;
    int totalPendapatan;
    
    Distributor (String nama, String unit, String nomerID, int jumlahTerjual, int harga){
    this.nama=nama;
    this.unit=unit;
    this.nomerID=nomerID;
    this.jumlahTerjual=jumlahTerjual;
    this.harga=harga;
    }

    public void setNama (String nama){
      this.nama=nama;
    }
    public String getNama (){
        return nama;
    }
    public void setUnit (String unit){
        this.unit=unit;
    }
    public String getUnit(){
        return unit;
    }
    public void setnomerID (String nomerID){
        this.nomerID=nomerID;
     }
    public String getnomerID (){
        return nomerID;
    }
    public void setjumlahTerjual(int jumlahTerjual){
        this.jumlahTerjual=jumlahTerjual;
    }
    public int getjumlahTerjual(){
        return jumlahTerjual;
    }
    public void setharga (int harga){
        this.harga=harga;
    }
    public int getharga(){
        return harga=harga;
    }
    public void settotalPendapatan(int totalPendapatan){
        this.totalPendapatan=totalPendapatan;
    }
    public int gettotalPendapatan(){
        return jumlahTerjual*harga;
    }      
public void display (){
    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("Nama                :"+nama);
    System.out.println("ID                  :"+nomerID);
    System.out.println("Unit                :"+unit);
    System.out.println("Total Pendapatan    :"+gettotalPendapatan());
    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>");
    
    
}

    

    
}

