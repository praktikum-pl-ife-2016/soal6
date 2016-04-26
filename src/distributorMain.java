import java.util.Scanner;
public class distributorMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        String nama, id, unit, namaBarang;
        int hargaBarang, terjual;
        
        System.out.print("Nama: ");
        nama = in.nextLine();
        System.out.print("Id: ");
        id = in.nextLine();
        System.out.print("Unit: ");
        unit = in.nextLine();
        System.out.print("Nama Barang: ");
        namaBarang = in.nextLine();
        System.out.print("Harga Barang: ");
        hargaBarang = in2.nextInt();
        System.out.print("Jumlah Terjual: ");
        terjual = in2.nextInt();
        
        if (unit.equalsIgnoreCase("wholeSaler")){
            wholeSaler data = new wholeSaler(nama, id, unit, namaBarang, hargaBarang, terjual);
        }else if(unit.equalsIgnoreCase("retailer")){
            retailer data = new retailer(nama, id, unit, namaBarang, hargaBarang, terjual);
        } else if(unit.equalsIgnoreCase("distributor")){
            distributor data = new distributor(nama, id, unit, namaBarang, hargaBarang, terjual);
            data.data();
            data.total();
        }else{
            System.out.println("Unit Salah");
        }
    }
}
