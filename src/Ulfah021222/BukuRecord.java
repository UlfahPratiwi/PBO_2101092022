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
public class BukuRecord {
    
    private String name; 
    private String address;
    private String notelp;
    private String email;
    
    // menggunakan method accessor dan mutator menggunakan get dan set
    
    // name
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    
    // address
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    
    // notelp
    public String getNotelp(){
        return notelp;
    }
    
    public void setNotelp(String notelp){
        this.notelp = notelp;
    }
    
    
    // email
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    
    // menggunakan method constructor - hanya menggunakan get saja
    public BukuRecord(){ //default
        
    }
    
    public BukuRecord(String name, String address , String notelp , String email){
        this.name = name;
        this.address = address;
        this.notelp = notelp;
        this.email = email;
    }
    
}
