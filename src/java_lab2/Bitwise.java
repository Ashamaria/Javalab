/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab2;

/**
 *
 * @author MCALAB01004
 */
public class Bitwise {
 
    public static void main(String a[])
    {
         int x = 10,y = 11;
         System.out.println("x =" + x);
         System.out.println("y =" + y);
         System.out.println( x&y);
         System.out.println(x|y);
         System.out.println( x^y);
         
         System.out.println(~x);
         System.out.println(x<<y);
         System.out.println(x>>y);
         System.out.println(x>>>1);
    }      
}
