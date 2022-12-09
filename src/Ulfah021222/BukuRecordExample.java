/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulfah021222;

/**
 *
 * @author ASUS
 */
public class BukuRecordExample {
     public static void main(String[] args){
        
        // method accessor dan mutator
        
        System.out.println("== Entry Buku Alamat ==" + "\n");
        System.out.println("Accessor dan Mutator Method");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        BukuRecord buku1 = new BukuRecord();
        
        buku1.setName("Ulfah Pratiwi");
        buku1.setAddress("Padang Panjang");
        buku1.setNotelp("082384984501");
        buku1.setEmail("ulfahpratiwi.bkt@gmail.com");
    
        System.out.println("Nama            : "+buku1.getName());
        System.out.println("Alamat          : "+buku1.getAddress());
        System.out.println("Nomor Telepon   : "+buku1.getNotelp());
        System.out.println("Alamat E-Mail   : "+buku1.getEmail());
        
        System.out.println("====================================================");
        
        // method constructor 
        
        System.out.println("Constructor Method");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        BukuRecord buku2 = new BukuRecord("Ulfah" , "Padang Panjang" , "082384984501" , "ulfahpratiwi.bkt@gmail.com" );
        
        System.out.println("Nama                    :"+buku2.getName());
        System.out.println("Alamat                  :"+buku2.getAddress());
        System.out.println("No.Telpon               :"+buku2.getNotelp());
        System.out.println("Alamat Email            :"+buku2.getEmail());
     }
    
   
}
