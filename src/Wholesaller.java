/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal;

/**
 *
 * @author AcerAsp4750
 */
public class Wholesaller extends Distributor {
    private double bonus, total;
    public Wholesaller(String n, int i, String u, double h, double j){
        super(n, i, u, h, j);
        bonus = 0;
        
    }
    
    public double totalPendapatan(){
        if (super.getJumlah() > 1000){
            total = super.totalPendapatan()+ 250000;
        }return total;

    } 
    
}
