/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulfah091222;

/**
 *
 * @author ASUS
 */
public class Person {
    
    //Modul 11
    
    protected String name;
    protected String address;
    
    //metode accessor
    //name
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    //address
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address){
        this.address =address;
    }
    
    //metode constructor
    public Person(){
        System.out.println("Inside Person : Constructor"); 
        name = "";
        address = "";
    }
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    
}
