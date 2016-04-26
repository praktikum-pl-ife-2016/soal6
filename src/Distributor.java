public class Distributor {

private String nama,id,unit;
private double harga,terjual,pendapatan;

public Distributor(String nama, String id,String unit,double harga,double terjual){
    this.nama = nama;
    this.id = id;
    this.terjual = terjual;
    this.unit = unit;
    this.harga = harga;
}
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getTerjual() {
        return terjual;
    }

    public void setTerjual(double terjual) {
        this.terjual = terjual;
    }

    public double getPendapatan() {
        pendapatan = terjual*harga;
        return pendapatan;
    }
}
