package maindistributor;
public class Retailer extends Distributor{
        double diskon;
    public Retailer(String name, String ID, String Unit, int jmlhTerjual) {
        super(name, ID, Unit, jmlhTerjual);
        diskon = 0;
    }
    public double getDiskon(){
        return (jumlahTerjual * super.harga) * 0.05;
    }
    public int getTotalPendapatan(){
        double total = (jumlahTerjual * harga) + getDiskon();
        return (int) total;
    }
}
