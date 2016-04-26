public class Wholesaler extends Distributor {    
    private int bonus;
    public int getBonus() {
        bonus= super.getJumlahTerjual()/1000*250000;
        return bonus;
    }
    public double getTotalPendapatan(){
        return bonus+super.getTotalPendapatan();
    }   
}
