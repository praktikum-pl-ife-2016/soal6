public class distributor {
    private String nama, id, unit, namaBarang;
    private int hargaBarang, terjual;

    public distributor(String nama, String id, String unit, String namaBarang,
            int hargaBarang, int terjual) {
        this.nama = nama;
        this.id = id;
        this.unit = unit;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.terjual = terjual;
    }

    public void data() {
        System.out.println("\n\nNama\t: " + nama);
        System.out.println("ID\t: " + id);
        System.out.println("Unit\t: " + unit);
    }

    public void total(){        
        int total = (hargaBarang * terjual);
        System.out.println("Gaji\t: Rp. " + total);
    }
}
