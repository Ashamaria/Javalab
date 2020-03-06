/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab5;

/**
 *
 * @author MCALAB01004
 */
import java.util.*;
public class Polymorphism {
   class Shape
   {   
       void draw()
       {
           System.out.println("shape draw()");
       }
       void erase()
       {
           System.out.println("Shape erase()");
       }
       class Circle extends Shape
       {
           @Override
           void draw()
           {
               System.out.println("shape draw()");
           }
           @Override
           void erase()
           {
             System.out.println("Shape erase()");
           }
       }
      class  Square extends Shape
      {
         @Override
         void draw()
           {
               System.out.println("shape draw()");
           }
         @Override
           void erase()
           {
             System.out.println("Shape erase()");
           } 
      }
             
public  class Shapes
{
 public static Shape randshape()
{
switch((int)(Math.random()*3))
{
case 0: return new Circle();
case 1: return new Square();
 
default : System.out.println(“default”);
return new Shape();
}
}

public static void main (String arg[])
{
Shape s[] = new Shape[9];
for(int i = 0;i< s.length; i++)
{
    s[i] = randshape();
    for(i= 0;i < s.length; i++)
      s[i].draw();
}

           }
       }
   }
}
