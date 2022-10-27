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

public class Latihan6 {
     public static void main (String[] args){
        
        //if-else
        
         String angka = "";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka (1-10) : ");
        int n = Integer.valueOf(angka).intValue();
        
        String hasil = "";
            if(n==1){
               hasil+= "Satu"; 
            }else if(n==2){
                hasil += "Dua";
            }else if(n==3){
                hasil += "Tiga";
            }else if(n==4){
                hasil += "Empat";
            }else if(n==5){
                hasil += "Lima";
            }else if(n==6){
                hasil += "Enam";
            }else if(n==7){
                hasil += "Tujuh";
            }else if(n==8){
                hasil += "Delapan";
            }else if(n==9){
                hasil += "Sembilan";
            }else if(n==10){
                hasil += "Sepuluh";
            }else{
            hasil += "Invalid Number";
            }

            
        JOptionPane.showMessageDialog(null, hasil);
    }
}
