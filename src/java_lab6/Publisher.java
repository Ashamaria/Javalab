/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab6;

/**
 *
 * @author MCALAB01004
 */
import java.util.*;
public class Publisher {
    int pno;
    String name;
 Publisher()
 {
     Scanner Sc = new Scanner(System.in);
     pno = Sc.nextInt();
     name = Sc.next();
 }
 void display()
 {
     System.out.println("publisher number = " + pno);
     System.out.println("publisher name = " + name); 
 }

   

    
}
class Book extends Publisher
{
    int price;
    String bname;
 Book()
 {
     Scanner Sc;
        Sc = new Scanner(System.in);
     price = Sc.nextInt();
     bname = Sc.next();
 }
    @Override
 void display()
 {
      super.display(); 
   System.out.println("book price = " + price);   
    System.out.println("book name = " + bname);
     
 }


public static void main(String args[])
{
    Book B = new Book();
    B.display();
}

}