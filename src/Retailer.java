/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributor;

/**
 *
 * @author Rezananda
 */
public class Retailer extends Distributor {

    private double diskon;

    public Retailer(String nm, String noId, String nmUnit, int hrgBr, int jmlTrj) {
        super(nm, noId, nmUnit, hrgBr, jmlTrj);
        diskon = 0;
    }

    public void setDiskon(double Diskon) {
        this.diskon = diskon;
    }

    public double getDiskon() {
        super.getJumlahBarang();
        diskon = 0.05 * (jumlahTerjual * hargaBarang);
        return diskon;
    }

    public int getTotal() {
        double total = (int) ((jumlahTerjual * hargaBarang) + getDiskon());
        return (int) total;
    }

}
