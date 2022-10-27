/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulfah071022;

/**
 *
 * @author ASUS
 */

import javax.swing.JOptionPane;

public class Latihan7 {
    public static void main (String[] args){
        
        //switch-case
        
        String angka = "";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka (1-10): ");
        int n = Integer.valueOf(angka).intValue();
        
        String hasil = "";
        switch(n){
            case 1 :{
                hasil += "Satu";
            } break;
            
            case 2 :{
                hasil += "Dua";
            } break;
            
            case 3 :{
                hasil += "Tiga";
            } break;
            
            case 4 :{
                hasil += "Empat";
            } break;
            
            case 5 :{
                hasil += "Lima";
            } break;
            
            case 6 :{
                hasil += "Enam";
            } break;
            
            case 7 :{
                hasil += "Tujuh";
            } break;
            
            case 8 :{
                hasil += "Delapan";
            } break;
            
            case 9 :{
                hasil += "Sembilan";
            } break;
            
            case 10 :{
                hasil += "Sepuluh";
            } break;
            
            default : {
                hasil += "Invalid Number";
            }break;
                
        }
        
        JOptionPane.showMessageDialog(null, hasil);
    }
}
