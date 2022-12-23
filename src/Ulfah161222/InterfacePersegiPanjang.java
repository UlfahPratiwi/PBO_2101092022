/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulfah161222;

/**
 *
 * @author ASUS
 */
public class InterfacePersegiPanjang {
    public static void main(String[] args) {
        Relation pp = new PersegiPanjang();
        PersegiPanjang luas1 = new PersegiPanjang(70,5);
        PersegiPanjang luas2 = new PersegiPanjang(20,3);
        
        boolean persegipanjangA_persegipanjangB = pp.isGreater(luas1,luas2);
        System.out.println("Luas A > Luas B : "+persegipanjangA_persegipanjangB);
    }
}
