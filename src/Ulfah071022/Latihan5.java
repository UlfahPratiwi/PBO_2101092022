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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan5 {
    public static void main (String[] args){
        
        //BufferedReader
        System.out.println("=== Program Membaca Bilangan ===");
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      
        int bil =0;
        String status = "";
        String status2 = "";
        
         try{
            System.out.print("Masukkan Bilangan (1-10): ");
            bil = Integer.parseInt(dataIn.readLine());
            //if-else
            if(bil==1){
               status = "Satu"; 
            }else if(bil==2){
                status = "Dua";
            }else if(bil==3){
                status = "Tiga";
            }else if(bil==4){
                status = "Empat";
            }else if(bil==5){
                status = "Lima";
            }else if(bil==6){
                status = "Enam";
            }else if(bil==7){
                status = "Tujuh";
            }else if(bil==8){
                status = "Delapan";
            }else if(bil==9){
                status = "Sembilan";
            }else if(bil==10){
                status = "Sepuluh";
            }else{
                status = "Invalid Number";
            }
            
           //switch
            switch(bil){ 
            case 1: 
                    status2 = "Satu";
                    break; 
            case 2: 
                    status2 = "Dua";
                    break; 
            case 3: 
                    status2 = "Tiga";
                    break;
            case 4: 
                    status2 = "Empat";
                    break;
            case 5: 
                    status2 = "Lima";
                    break;
            case 6: 
                    status2 = "Enam";
                    break;
            case 7: 
                    status2 = "Tujuh";
                    break;
            case 8: 
                    status2 = "Delapan";
                    break;
            case 9: 
                    status2 = "Sembilan";
                    break;
            case 10: 
                    status2 = "Sepuluh";
                    break;
            default: 
                status2 = "Invalid Number";
            }
            
        }catch(IOException e){
            System.out.println("Error!");
        }
        
        System.out.println(bil+" "+"adalah bilangan : "+status);
        System.out.println(bil+" "+"adalah bilangan : "+status2);  
    }
}
