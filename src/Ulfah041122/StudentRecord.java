/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulfah041122;

/**
 *
 * @author ASUS
 */
public class StudentRecord {
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average; 
    private double maximum;
    private static int studentCount;
    
    //area penulisan kode selanjutnya
    
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
        this.address = address;
    }
    
    
    //age
    public int getAge() {
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    //mathGrade
    public double getMathGrade() {
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    //englishGrade
    public double getEnglishGrade() {
        return englishGrade;
    }
    
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    //scienceGrade
    public double getScienceGrade() {
        return scienceGrade;
    }
    
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    //average tidak ada set-nya
    public double getAverage() {
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    
    //studentCount tidak ada set-nya
    public double getStudentCount() {
        return studentCount;
    }
    
    //maximum
    public double getMaximum() {
    
        maximum = (mathGrade >= englishGrade)? mathGrade:englishGrade;
        maximum = (scienceGrade >= maximum)? scienceGrade:maximum;
        
        return maximum;
    }
}
