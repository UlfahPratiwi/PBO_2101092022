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
public class PersegiPanjang implements Relation {
    private double x; 
    private double y;
    
    public PersegiPanjang(){ ///ini harus ditambahkan karena default
        
    }
    
    public PersegiPanjang(double x, double y){ 
        this.x = x; 
        this.y = y;  
    }
    
    public double getLuas(){  ///fungsi utk mendptkn garis
        double luas = (x*y); 
        return luas; 
    }
    
    public boolean isGreater(Object a, Object b){
        double aLuas = ((PersegiPanjang)a).getLuas(); 
        double bLuas = ((PersegiPanjang)b).getLuas(); 
        return (aLuas > bLuas); 
    } 
    
    public boolean isLess(Object a, Object b){
        double aLuas = ((PersegiPanjang)a).getLuas(); 
        double bLuas = ((PersegiPanjang)b).getLuas(); 
        return (aLuas < bLuas); 
    } 
    
    public boolean isEqual(Object a, Object b){
        double aLuas = ((PersegiPanjang)a).getLuas(); 
        double bLuas = ((PersegiPanjang)b).getLuas(); 
        return (aLuas == bLuas);
    }
}
