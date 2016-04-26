public class wholeSaler extends distributor {
    public wholeSaler(String nama, String id, String unit, String namaBarang,
            int hargaBarang, int terjual){
        
        super(nama, id, unit, namaBarang, hargaBarang, terjual);
        super.data();
        int gaji = hargaBarang * terjual;
        int bonus = (terjual / 1000) * 250000;
        int total = gaji + bonus;
        System.out.println("Gaji\t: Rp. " + total);
    }   
}