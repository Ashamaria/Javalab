/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab3_4;

/**
 *
 * @author MCALAB01004
 */import java.util.*;
public class Operatorthis {
     private String name;
   private int age;
   public Operatorthis SetValues()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the name of the student: ");
      String name = sc.next();
      System.out.println("Enter the age of the student: ");
      int age = sc.nextInt();
      this.name = name;
      this.age = age;
      return this;
   }
   public void display()
   {
      System.out.println("name: "+name);
      System.out.println("age: "+age);
   }
   public static void main(String args[])
   {
      Operatorthis R = new Operatorthis();
      R = R.SetValues();
      R.display();
  }
}
 

