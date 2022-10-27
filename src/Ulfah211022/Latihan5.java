/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulfah211022;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        
        //do-while
        
        Scanner b = new Scanner(System.in);
        
        System.out.println("--------->Program Perpangkatan<---------");
        System.out.print("Masukkan nilai angka : ");
        int input = b.nextInt();

        System.out.print("Masukkan nilai pangkat : ");
        int pangkat = b.nextInt();

        int i = 0;
        int h = 1;
        
        do{
           
           h = h*input;
           i++; 
          
        }while(i<pangkat);
        
        System.out.println("Hasil dari" + " ==> " + input + " ^ " + pangkat + " = " + h);
        
        
        
    }
}
