
public class Distributor {
    private String nama;
private String nomer;
private String unit;
private int harga;
private int jumlah;
private int totalPendapatan;
Distributor(String nama,String nomer,String unit,int harga, int jum){
this.nama= nama;
this.nomer= nomer;
this.unit = unit;
this.harga = harga;
this.jumlah = jum;
}
public String getNama(){
return nama;
}
public String getNomer(){
return nomer;
}
public int getJumlah (){
return jumlah;
}
public int getPendapatan(){
totalPendapatan = harga * jumlah;
return totalPendapatan;
}
public String getUnit(){
return unit;
}
public void tampilan(){
System.out.println("Nama : "+nama);
System.out.println("ID : "+nomer);
System.out.println("Unit : "+unit);
System.out.println("Total pendapatan : "+getPendapatan());
System.out.println("-----------------------------------");
}
}

