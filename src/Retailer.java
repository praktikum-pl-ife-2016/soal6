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
public class Retailer extends Distributor {
    private double diskon;
    public Retailer(String n, int i, String u, double h, double j){
        super(n,i,u,h,j);
        diskon = 0;
    }
    
    public double totalPendapatan(){
        diskon = super.totalPendapatan()+super.totalPendapatan()*0.05;
        return diskon;
    }
    
}
