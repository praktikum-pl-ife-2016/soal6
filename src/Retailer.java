


public class Retailer extends distributor{
    private int diskon=5/100;
    
    public Retailer(String nama,String nomerID,String namaUnit,int hargaBarang,int jumlahTerjual){
        super(nama,nomerID,namaUnit,hargaBarang,jumlahTerjual);
    }
    public void display(){
            int c=super.getJumlahTerjual()*super.getHargaBarang();
            super.setTotalPendapatan(c+c*5/100);
             System.out.println("Nama :"+super.getNama()+"\nNomerID:"+super.getNomerID()+"\nUnit:"+super.getNamaUnit()+"\nTotal pendapatan:"+super.getTotalPendapatan());
            

    
    
    }
}
