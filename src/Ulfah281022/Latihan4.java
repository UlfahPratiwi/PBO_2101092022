/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulfah281022;

/**
 *
 * @author ASUS
 */
public class Latihan4 {
    public static void main(String[] args) {
        
        // do-while
        
        String alamat[][] = {{"Florence","735-1234","Manila"},{"Joyce","983-3333","Quezon City"},{"Becca","456-3322","Manila"}};
        int i=0;
        do{
            System.out.println("Name    : " +alamat[i][0]);
            System.out.println("Tel.#   : " +alamat[i][1]);
            System.out.println("Alamat  : " +alamat[i][2]);
            System.out.println("");
            i++;
        }while (i < 3);
    }
}
