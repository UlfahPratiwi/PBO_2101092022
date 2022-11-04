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
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord student1 = new StudentRecord();
        
        student1.setName("Ulfah");
        student1.setAddress("Padang Panjang");
        student1.setAge(20);
        student1.setMathGrade(100);
        student1.setEnglishGrade(80);
        student1.setScienceGrade(90);
        
        //
        
        System.out.println("Nama                    :"+student1.getName());
        System.out.println("Alamat                  :"+student1.getAddress());
        System.out.println("Umur                    :"+student1.getAge());
        System.out.println("Nilai Matematika        :"+student1.getMathGrade());
        System.out.println("Nilai B.Inggris         :"+student1.getEnglishGrade());
        System.out.println("Nilai Pengetahuan Alam  :"+student1.getScienceGrade());
        System.out.println("Rata-rata nilai         :"+student1.getAverage());
        System.out.println("Nilai Tertinggi         :"+student1.getMaximum());
        
        
    }
}
