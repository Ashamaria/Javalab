/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab9;

/**
 *
 * @author MCALAB01004
 */
public class Box {
    int l,b,h;
    Box()
    {
        
        l = 10;
        
        b = 5;
        
        h = 3;
    }
    void area()
    {
       
        System.out.println("area  = " + (l*b)); 
    }
    void volume()
    {
      System.out.println("volume = " + (l*b*h));   
    }
}


class Boxd extends Box
{
    int l1,b1,h1;
    Boxd()
    {
        l1 = 4;
        b1 = 2;
        h1 = 5;
    }
    
void area1()
{
    System.out.println("area  = " + (l1*b1));  
    
}
    
  void volume1()
  {
      System.out.println("volume = " + (b1*h1*l1));   
  }
public static void main(String args[])
{
   Box B = new Box();
   B.area();
   B.volume();
   Boxd D = new Boxd();
   D.area1();
   D.volume1();
}
}