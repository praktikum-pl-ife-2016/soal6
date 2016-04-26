
public class Retailer extends Distributor {
    private double diskon;
    
    public Retailer(String nama, String id, String Unit, int Harga, int Terjual){
    super( nama,  id,  Unit, Harga, Terjual);
    diskon =0;
    }
    
    public int TotalPendapatan(){
    return super.getTotalPendapatan()+ (int)(super.getTotalPendapatan()*0.05);
    }
    
    public void display(){
        System.out.println("nama\t\t\t: "+getNama());
        System.out.println("ID\t\t\t: "+getId());
        System.out.println("unit\t\t\t: "+getUnit());
        System.out.println("Total Pendapatan\t: "+TotalPendapatan());
    }
}
