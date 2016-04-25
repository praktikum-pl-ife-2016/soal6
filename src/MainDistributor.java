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
public class MainDistributor {
    public static void main(String[] args) {
        Distributor dis = new Distributor ("Fatim",1234,"Distributor",1000,1100);
        dis.DisplayMessage();
        Wholesaller whole = new Wholesaller ("Matuz",1234,"Wholesaller",1000,1100);
        whole.DisplayMessage();
        Retailer ret = new Retailer ("Zahro",1234,"Retailer",1000,1100);
        ret.DisplayMessage();
    }
    
}
