public class retailer extends distributor {
    public retailer(String nama, String id, String unit, String namaBarang,
            int hargaBarang, int terjual) {
        
        super(nama, id, unit, namaBarang, hargaBarang, terjual);
        super.data();
        int total = (hargaBarang * terjual) - (hargaBarang * terjual * 5 / 100);
        System.out.println("Gaji\t: Rp. " + total);
    }
}
