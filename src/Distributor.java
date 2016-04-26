public class Distributor {
private String nama, id, unit;
public int jual, pendapatan, harga, barang;
public Distributor(String nama, String id, String unit, int harga, int jual){
    this.nama = nama;
    this.id = id;
    this.unit = unit;
    this.nama = nama;
    this.harga = harga;
    this.jual = jual;
    setPendapatan(jual*harga);
 
}
void setNama(String nama){
this.nama = nama;
}
void setID(String id){
this.id = id;
}
void setUnit(String unit){
this.unit = unit;
}
void setBarang(int barang){
this.barang = barang;
}
void setJual(int jual){
this.jual = jual;
}
void setHarga(int harga){
this.harga = harga;
}
public void setPendapatan(int Pendapatan){
 this.pendapatan = pendapatan;
  }

public String getNama(){
return nama;
}
public String  getID(){
return id;
}
public String getUnit(){
return unit;
}
public int getBarang(){
return barang;
}
public int getJual(){
return jual;
}
public int getHarga(){
return harga;
}
public int getPendapatan(){

return pendapatan;
}
}
