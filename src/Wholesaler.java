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
public class Wholesaler extends Distributor {

    private int bonus;

    public Wholesaler(String nm, String noId, String nmUnit, int hrgBr, int jmlTrj) {
        super(nm, noId, nmUnit, hrgBr, jmlTrj);
        bonus = 0;
    }

    public void setBonus(int Bonus) {
        this.bonus = Bonus;

    }

    public int getBonus() {
        super.getJumlahBarang();
        int kelipatan = jumlahTerjual / 1000;
        bonus = kelipatan * 250000;
        return bonus;
    }

    public int getTotal() {
        int total = (hargaBarang * jumlahTerjual) + getBonus();
        return total;
    }

}
