/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulfah.model;

/**
 *
 * @author ASUS
 */
public class Anggota {
    private String nobp; //attribute
    private String nama;  //attribute
    private String alamat; //attribute

    //contruktor
    public Anggota() {
    }

    public Anggota(String nobp, String nama, String alamat) {
        this.nobp = nobp;
        this.nama = nama;
        this.alamat = alamat;
    }
    //contruktor
    
    
    //nobp
    public String getNobp(){
        return nobp;
    }
    
    public void setNobp(String nobp){
        this.nobp = nobp;
    }
    
    //nama
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    //alamat
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
}
