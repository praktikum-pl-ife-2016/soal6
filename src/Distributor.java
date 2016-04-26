public class Distributor {
public String nama,nomorID,namaunit;
final int hargaBarang;
int jlhTerjual,totalPendapatan;

Distributor(String nama, String nomorID, String namaunit,int jlhTerjual){
    this.nama = nama;
    this.nomorID = nomorID;
    this.namaunit = namaunit;
    this.jlhTerjual = jlhTerjual;
     
    hargaBarang =100;          
}

public String getNama(){
   return nama;
}
public String getnomorId(){
    return this.nomorID;
}
public String getNamaUnit(){
    return this.namaunit;
}   
public int getTotalPendapatan(){
    return totalPendapatan= jlhTerjual*hargaBarang;
}
}

    

