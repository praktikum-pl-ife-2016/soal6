


public class Distributor {

    private String nama;
    private int nomorID;
    private String unit;
    int hargaBarang;
    int jumlahTerjual;
    int totalPendapatan;
    
    public Distributor (String nm,int nID,String un,int hrb,int jmt){
        
        nama=nm;
        nomorID=nID;
        unit=un;
        hargaBarang=hrb;
        jumlahTerjual=jmt;
        
        
   }
    
    public String getNama (){
        return nama;
        
    }
    
    public int getNomorID (){
        return nomorID;
    }
    public String getUnit (){
        return unit;
    }
    
    public int getHargaBarang (){
        return hargaBarang;
    }
    
    public int getJumlahTerjual (){
        return jumlahTerjual;
    }
    
    
    public void setTotalPendapatan (){
        totalPendapatan = hargaBarang*jumlahTerjual;
        
    }

     public int getTotalPendapatan (){
        return totalPendapatan;
}
}

