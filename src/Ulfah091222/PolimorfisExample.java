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
public class PolimorfisExample {
  public static void main(String[] args){
      Person ref;
      Student studentObject = new Student();
      Employee employeeObject = new Employee();
      
      ref = studentObject;
      String temp = ref.getName();
      System.out.println("Ulfah Pratiwi"+temp);
      
      ref = employeeObject;
      String temp1 = ref.getName();
      System.out.println("Ulfah Pratiwi"+temp1);
      
  }  
}
