public class Distributor {
    private String nama;
    private String noID;
    private String unit;
    private int hargaBrg, jumlahTerjual, totalPendapatan;
    
   
    public Distributor(String nama,String noID,String unit,int hargaBrg, int jumlahTerjual){
        this.nama= nama;
        this.noID= noID;
        this.unit = unit;
        this.hargaBrg = hargaBrg;
        this.jumlahTerjual = jumlahTerjual;
    }
    public String getNama(){
        return nama;
    }
    public String getNomer(){
        return noID;
    }
    public String getUnit(){
        return unit;
    }
     public int getJmlhTerjual (){
        return jumlahTerjual;
    }
       public int getHargaBrg (){
        return hargaBrg;
    }
    public int getPendapatan(){
        totalPendapatan = hargaBrg * jumlahTerjual;
        return totalPendapatan;
    }
    public void display () {
        System.out.println("=====================================");
        System.out.println("Nama             : "+nama);
        System.out.println("ID               : "+noID);
        System.out.println("Unit             : "+unit);
        System.out.println("Total pendapatan : "+getPendapatan());
        System.out.println("=====================================");
    }
}