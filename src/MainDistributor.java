
package maindistributor;

public class MainDistributor {

    public static void main(String[] args) {
     Distributor kar1=new Distributor("madan","12313","Distributor",100,1900);
     Wholesaler kar2=new Wholesaler("najab","122233","Wholesaler",100,1900);
     Retailer kar3=new Retailer("aldos","233343","Retailer",100,1900);
     
        kar1.tampil();
        System.out.println("========================");
        kar2.Tampil2();
        System.out.println("========================");
        kar3.Tampil();
        System.out.println("========================");
    }
    
}
