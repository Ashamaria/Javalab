/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab3;

/**
 *
 * @author MCALAB01004
 */
public class Simpleobject {
   private final String i;
    Simpleobject(String i)
    {
        this.i=i;
        System.out.println(i);
    }
    public static void main(String args[])
    {
     String i="Hello World";
     Simpleobject S;
        S = new Simpleobject(i);
    }
   
}  

