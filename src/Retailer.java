
public class Retailer extends Distributor {

    private int bonus;
public Retailer(String nama, String nomer, String unit, int harga, int jum) {
super(nama, nomer, unit, harga, jum);
}
public int getBonus(){
bonus = (int) (0.05 * super.getPendapatan());
return bonus;
}
public int getPendapatan(){
return (super.getPendapatan()+getBonus());
}
}