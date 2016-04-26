public class Dsitributor {
private String nama,nomorID,namaUnit;
final int hargaBarang;
int jlhTerjual,totalPendapatan;

Dsitributor(){
    hargaBarang =100;
           
}
public void setNama(String x){
    this.nama=x;
}
public void setNomrId(String x){
    this.nomorID =x;
}
public void setNamaUnit(String x){
    this.namaUnit =x;
}
public void setJlhTerjual(int x){
    this.jlhTerjual=x;
}
public String getNama(){
   return nama;
}
public String getnomorId(){
    return this.nomorID;
}
public String getNamaUnit(){
    return this.namaUnit;
}   
public int getTotalPendapatan(){
    return totalPendapatan= jlhTerjual*hargaBarang;
}
}
