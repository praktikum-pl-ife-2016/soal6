

public class Wholesaler extends Distributor{
    private int bonus;
    
    public Wholesaler(String nama, String id, String Unit, int Harga, int Terjual){
    super( nama, id,  Unit, Harga, Terjual);
    bonus = 250000*super.getTerjual()/1000;
    }
    
    public int totalPendapatan(){
    
    if(super.getTerjual()>=1000){
        return super.getTotalPendapatan()+bonus;
    }else{
        return super.getTotalPendapatan();
        }
    }
    
    public void display(){
        System.out.println("nama\t\t\t: "+getNama());
        System.out.println("ID\t\t\t: "+getId());
        System.out.println("unit\t\t\t: "+getUnit());
        System.out.println("Total Pendapatan\t: "+totalPendapatan());
    }
}
